// Load the AWS SDK for Node.js
var AWS = require('aws-sdk');
// Set the region 
AWS.config.update({region: 'REGION'});

// Create the DynamoDB service object
var ddb = new AWS.DynamoDB({apiVersion: '2012-08-10'});

ddb.putItem({
  TableName: 'STATIC_NAME',
  Item: {
    'CUSTOMER_ID' : {N: '001'},
    'CUSTOMER_NAME' : {S: 'Richard Roe'}
  }
}, function(err, data) {
  if (err) {
    console.log("Error", err);
  } else {
    console.log("Success", data);
  }
});

var globalvarstr = 'abc';
var globalvarint = 123;
var globalvararr = ['def'];

var params = {
  TableName: 'CUSTOMER_LIST',
  Item: {
    'CUSTOMER_ID' : {N: '001'},
    'CUSTOMER_NAME' : {S: 'Richard Roe'}
  }
};

function doThing(arg) {
  ddb.putItem(arg, function(err, data) {
    if (err) {
      console.log("Error", err);
    } else {
      console.log("Success", data);
    }
  });

  var localvarstr = 'abc';
  var localvarint = 123;
  var localvararr = ['def'];

  var globalvarstr = 'hij';

  // Call DynamoDB to add the item to the table
  ddb.getItem({
    TableName: globalvarstr,
    Item: {
      'CUSTOMER_ID' : {N: '001'},
      'CUSTOMER_NAME' : {S: 'Richard Roe'}
    }
  }, function(err, data) {
    if (err) {
      console.log("Error", err);
    } else {
      console.log("Success", data);
    }
  });
}

doThing({
  TableName: 'OTHER_TABLE_NAME',
  Item: {
    'CUSTOMER_ID' : {N: '001'},
    'CUSTOMER_NAME' : {S: 'Richard Roe'}
  }
});
