# iamfast

:construction: EXPERIMENTAL :construction:

> IAM policy generation from application code

## Installation

```
npm i -g iamfast
```

You can also install iamfast as a [Visual Studio Code extension](https://marketplace.visualstudio.com/items?itemName=iann0036.iamfast).

## Usage

Execute `iamfast` with the first argument being the file or directory (currently slow, not yet recommended) to be scanned.

```
iamfast yourfile.js
```

iamfast [supports](#development-progress) the following programming languages:

* JavaScript (v2 SDK)
* Python 3 (Boto3 SDK)
* Go (v1 SDK)
* Java (v2 SDK)

#### Optional Flags

`--format <type>`: Sets the format of the output, currently supporting `json` (default), `yaml`, `hcl` and `sam`

## Example

```
> cat tests/js/test1.js
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
> iamfast tests/js/test1.js
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

## Test

To run tests:

```node
npm test
```

## Development Progress

### General

- [ ] Gather test cases
- [x] Environment variable referencing in SAM output
- [ ] Online tool for quick evaluation
- [ ] GitHub app

### JavaScript

- [x] Lexing & parsing with ANTLR
- [x] Custom tree walker
- [x] Identify standard SDK definitions
- [ ] Identify SDK region
- [ ] Identify advanced SDK definitions
- [x] Identify client instantiations
- [x] Identify client calls
- [ ] Identify client calls with advanced method chaining
- [x] Identify resource instantiations (AWS.S3.ManagedUpload, AWS.DynamoDB.DocumentClient)
- [x] Identify resource calls
- [x] Interpret call arguments (top-level, static)
- [x] Interpret call arguments (top-level, variable)
- [x] Interpret call arguments (deep, static)
- [x] Interpret call arguments (deep, variable)
- [x] Track literal variables
- [x] Track object variables
- [x] Track environmental variables
- [x] Understand scope (build the call stack)
- [ ] Cross-file relationships
- [ ] Understand entrypoints and code accessibility
- [ ] Performance tuning

### Python

- [x] Lexing & parsing with ANTLR
- [x] Custom tree walker
- [x] Identify standard SDK definitions
- [ ] Identify SDK region
- [x] Identify advanced SDK definitions ("as x" etc.)
- [x] Identify client instantiations
- [x] Identify client calls
- [ ] Identify client calls with advanced method chaining
- [x] Identify resource instantiations
- [x] Identify resource calls
- [x] Interpret call arguments (top-level, static)
- [ ] Interpret call arguments (top-level, variable)
- [ ] Interpret call arguments (deep, static)
- [ ] Interpret call arguments (deep, variable)
- [ ] Track literal variables
- [ ] Track object variables
- [ ] Track environmental variables
- [ ] Understand scope (build the call stack)
- [ ] Cross-file relationships
- [ ] Understand entrypoints and code accessibility
- [ ] Performance tuning

### Go

- [x] Lexing & parsing with ANTLR
- [x] Custom tree walker
- [x] Identify standard SDK definitions
- [ ] Identify SDK region
- [ ] Identify advanced SDK definitions
- [x] Identify client instantiations
- [x] Identify client calls
- [ ] Identify client calls with advanced method chaining
- [x] Interpret call arguments (top-level, static)
- [ ] Interpret call arguments (top-level, variable)
- [ ] Interpret call arguments (deep, static)
- [ ] Interpret call arguments (deep, variable)
- [x] Track literal variables
- [ ] Track object variables
- [ ] Track environmental variables
- [ ] Understand scope (build the call stack)
- [ ] Cross-file relationships
- [ ] Understand entrypoints and code accessibility
- [ ] Performance tuning

### Java

- [x] Lexing & parsing with ANTLR
- [x] Custom tree walker
- [x] Identify standard SDK definitions
- [ ] Identify SDK region
- [ ] Identify advanced SDK definitions
- [x] Identify client instantiations
- [x] Identify client calls
- [ ] Identify client calls with advanced method chaining
- [ ] Interpret call arguments (top-level, static)
- [ ] Interpret call arguments (top-level, variable)
- [ ] Interpret call arguments (deep, static)
- [ ] Interpret call arguments (deep, variable)
- [ ] Track literal variables
- [ ] Track object variables
- [ ] Track environmental variables
- [ ] Understand scope (build the call stack)
- [ ] Cross-file relationships
- [ ] Understand entrypoints and code accessibility
- [ ] Performance tuning

### C++

- [x] Lexing & parsing with ANTLR
- [x] Custom tree walker
- [x] Identify standard SDK definitions
- [ ] Identify SDK region
- [ ] Identify advanced SDK definitions
- [x] Identify client instantiations
- [x] Identify client calls
- [ ] Identify client calls with advanced method chaining
- [ ] Interpret call arguments (top-level, static)
- [ ] Interpret call arguments (top-level, variable)
- [ ] Interpret call arguments (deep, static)
- [ ] Interpret call arguments (deep, variable)
- [ ] Track literal variables
- [ ] Track object variables
- [ ] Track environmental variables
- [ ] Understand scope (build the call stack)
- [ ] Cross-file relationships
- [ ] Understand entrypoints and code accessibility
- [ ] Performance tuning
