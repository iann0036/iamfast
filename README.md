<p align="center"><b>JavaScript</b> • <a href="https://github.com/iann0036/iamfast-python">Python</a> • <a href="https://github.com/iann0036/iamfast-go">Go</a> • <a href="https://github.com/iann0036/iamfast-java">Java</a> • <a href="https://github.com/iann0036/iamfast-vscode">VS Code</a></p>

# iamfast (JavaScript)

:construction: EXPERIMENTAL - WORK IN PROGRESS :construction:

> IAM policy generation from application code

## Installation

```
npm i -g iamfast
```

## Usage

```
iamfast-js yourfile.js
```

## Example

```
> cat tests/test1.js
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
```

```
> iamfast-js tests/test1.js
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
## Development 
Current solution uses [acorn](https://github.com/acornjs/acorn) parser. The following links could be helpful to visualize parser's output
1) [AST Explorer](https://astexplorer.net/)
2) [AST Visulaizer](https://resources.jointjs.com/demos/javascript-ast)

For the reference ESTree AST types could be found [here](https://github.com/estree/estree/blob/master/es2022.md)

## Test
the command to run tests

```node
npm test
```