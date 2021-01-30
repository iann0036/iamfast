# iamfast

:construction: EXPERIMENTAL - WORK IN PROGRESS :construction:

> IAM policy generation from code

## Usage

### Node (JavaScript)

```
node js/main.js yourfile.js
```

### Python

```
node python/main.py yourfile.py
```

## Example

### Node (JavaScript)

```
% cat js/tests/test1.js
// Load the AWS SDK for Node.js
var AWS = require('aws-sdk');
// Set the region 
AWS.config.update({region: 'us-east-1'});

// Create the DynamoDB service object
var ddb = new AWS.DynamoDB({apiVersion: '2012-08-10'});

var params = {
  TableName: 'CUSTOMER_LIST',
  Item: {
    'CUSTOMER_ID' : {N: '001'},
    'CUSTOMER_NAME' : {S: 'Richard Roe'}
  }
};

// Call DynamoDB to add the item to the table
ddb.putItem(params, function(err, data) {
  if (err) {
    console.log("Error", err);
  } else {
    console.log("Success", data);
  }
});

% node js/main.js js/tests/test1.js
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "dynamodb:PutItem",
            "Resource": [
                "arn:aws:dynamodb:us-east-1:123456789012:table/CUSTOMER_LIST"
            ]
        }
    ]
}
```

### Python

```
% cat python/tests/test1.py
import boto3

# Create SQS client
sqs = boto3.client('sqs')

# Create a SQS queue
response = sqs.create_queue(
    QueueName='SQS_QUEUE_NAME',
    Attributes={
        'DelaySeconds': '60',
        'MessageRetentionPeriod': '86400'
    }
)

print(response['QueueUrl'])

% python3 python/main.py python/tests/test1.py
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": "sqs:CreateQueue",
            "Resource": [
                "arn:aws:sqs:us-east-1:123456789012:SQS_QUEUE_NAME"
            ]
        }
    ]
}
```
