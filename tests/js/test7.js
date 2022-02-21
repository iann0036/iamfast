// Load the AWS SDK for Node.js
var AWS = require('aws-sdk');
// Set the region 
AWS.config.update({region: 'us-east-2'});

ecr = new AWS.ECR({apiVersion: '2015-09-21'});

ecr.listTagsForResource({resourceArn: "notvalid"}, function(err, data) {
  if (err) {
    console.log("Error", err);
  } else {
    console.log("Success", data.Buckets);
  }
});