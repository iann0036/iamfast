var AWS = require('aws-sdk');

var apigateway = new AWS.APIGateway();

var params = {
    keyId: 'mykeyid',
    usagePlanId: 'myusageplanid'
};

var blahblah = 123;

if (blahblah == 123) {
    apigateway.deleteUsagePlanKey(params, function(err, data) {
        if (err) console.log(err, err.stack); // an error occurred
        else     console.log(data);           // successful response
    });
}
