const AWS = require("aws-sdk");
const uuid = require("uuid").v4;

const {
  COLLECTION_ID,
  FACES_TABLENAME,
  MIN_CONFIDENCE,
  OBJECTS_OF_INTEREST_LABELS,
  REGION,
} = process.env;

const rekognition = new AWS.Rekognition({ region: REGION });
const dynamo = new AWS.DynamoDB({ region: REGION });

const respond = (statusCode, response) => ({
  statusCode,
  body: JSON.stringify(response),
  headers: {
    "Access-Control-Allow-Origin": "*",
    "Content-Type": "application/json",
  },
});

exports.indexHandler = async (event) => {
  const ExternalImageId = uuid();
  const body = JSON.parse(event.body);

  const indexFace = () =>
    rekognition
      .indexFaces({
        CollectionId: COLLECTION_ID,
        ExternalImageId,
        Image: { Bytes: Buffer.from(body.image, "base64") },
      })
      .promise();

  const persistMetadata = () =>
    dynamo
      .putItem({
        Item: {
          CollectionId: { S: COLLECTION_ID },
          ExternalImageId: { S: ExternalImageId },
          FullName: { S: body.fullName },
        },
        TableName: FACES_TABLENAME,
      })
      .promise();

  try {
    await indexFace();
    await persistMetadata();
    return respond(200, { ExternalImageId });
  } catch (e) {
    console.log(e);
    return respond(500, { error: e });
  }
};

const fetchFaces = async (imageBytes) => {
  /*
    Detect Faces
    Uses Rekognition's DetectFaces functionality
  */

  const facesTest = {
    TestName: "Face Detection",
  };

  const detectFaces = () =>
    rekognition.detectFaces({ Image: { Bytes: imageBytes } }).promise();

  try {
    const faces = await detectFaces();
    const nFaces = faces.FaceDetails.length;
    facesTest.Success = nFaces === 1;
    facesTest.Details = nFaces;
  } catch (e) {
    console.log(e);
    facesTest.Success = false;
    facesTest.Details = "Server error";
  }
  return facesTest;
};

const fetchLabels = async (imageBytes) => {
  /*
    Detect Objects Of Interest and number of Persons
    Uses Rekognition's DetectLabels functionality
  */

  const objectsOfInterestLabels = OBJECTS_OF_INTEREST_LABELS.trim().split(",");
  const objectsOfInterestTest = { TestName: "Objects of Interest" };
  const peopleTest = { TestName: "Person Detection" };

  const detectLabels = () =>
    rekognition
      .detectLabels({
        Image: { Bytes: imageBytes },
        MinConfidence: MIN_CONFIDENCE,
      })
      .promise();

  try {
    const labels = await detectLabels();

    const people = labels.Labels.find((x) => x.Name === "Person");
    const nPeople = people ? people.Instances.length : 0;
    peopleTest.Success = nPeople === 1;
    peopleTest.Details = nPeople;

    const objectsOfInterest = labels.Labels.filter((x) =>
      objectsOfInterestLabels.includes(x.Name)
    );
    objectsOfInterestTest.Success = objectsOfInterest.length === 0;
    objectsOfInterestTest.Details = objectsOfInterestTest.Success
      ? "0"
      : objectsOfInterest
          .map((x) => x.Name)
          .sort()
          .join(", ");
  } catch (e) {
    console.log(e);
    objectsOfInterestTest.Success = false;
    objectsOfInterestTest.Details = "Server error";
    peopleTest.Success = false;
    peopleTest.Details = "Server error";
  }
  return [objectsOfInterestTest, peopleTest];
};

const fetchModerationLabels = async (imageBytes) => {
  /*
    Detect Unsafe Content
    Uses Rekognition's DetectModerationLabels functionality
  */
  const moderationLabelsTest = {
    TestName: "Unsafe Content",
  };

  const detectModerationLabels = () =>
    rekognition
      .detectModerationLabels({
        Image: { Bytes: imageBytes },
        MinConfidence: MIN_CONFIDENCE,
      })
      .promise();

  try {
    const labels = await detectModerationLabels();
    const nLabels = labels.ModerationLabels.length;
    moderationLabelsTest.Success = nLabels === 0;
    moderationLabelsTest.Details = moderationLabelsTest.Success
      ? "0"
      : labels.ModerationLabels.map((l) => l.Name)
          .sort()
          .join(", ");
  } catch (e) {
    console.log(e);
    moderationLabelsTest.Success = false;
    moderationLabelsTest.Details = `Server error`;
  }

  return moderationLabelsTest;
};

const searchForIndexedFaces = async (imageBytes) => {
  /*
    Face Matching

    Uses Rekognition's SearchFacesByImage functionality 
    to match face across the database of previously 
    indexed faces
  */

  const faceMatchTest = {
    TestName: "Person Recognition",
    Success: false,
    Details: "0",
  };

  const searchFace = () =>
    rekognition
      .searchFacesByImage({
        CollectionId: COLLECTION_ID,
        FaceMatchThreshold: MIN_CONFIDENCE,
        MaxFaces: 1,
        Image: { Bytes: imageBytes },
      })
      .promise();

  const getFaceByExternalImageId = (id) =>
    dynamo
      .getItem({
        TableName: FACES_TABLENAME,
        Key: { ExternalImageId: { S: id } },
      })
      .promise();

  try {
    const faces = await searchFace();
    const faceDetails = await getFaceByExternalImageId(
      faces.FaceMatches[0].Face.ExternalImageId
    );

    if (faceDetails.Item) {
      faceMatchTest.Success = true;
      faceMatchTest.Details = faceDetails.Item.FullName.S;
    }
  } catch (e) {
    // When 0 faces are recognized, rekognition.searchFacesByImage throws an error
    console.log(e);
  }
  return faceMatchTest;
};

exports.processHandler = async (event) => {
  const body = JSON.parse(event.body);
  const imageBytes = Buffer.from(body.image, "base64");

  const result = await Promise.all([
    fetchLabels(imageBytes),
    searchForIndexedFaces(imageBytes),
    fetchFaces(imageBytes),
    fetchModerationLabels(imageBytes),
  ]);

  return respond(200, result.flat());
};