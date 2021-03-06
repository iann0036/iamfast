const express = require('express')
const app = express()
const serverless = require('serverless-http');
const bodyParser = require('body-parser');
const libphonenumber = require('libphonenumber-js');
// set up AWS resources
const AWS = require('aws-sdk');
const chime = new AWS.Chime({ region: 'us-east-1' });
chime.endpoint = new AWS.Endpoint('https://service.chime.aws.amazon.com/console');

app.use(bodyParser.json({ strict: false }));

// API Root
app.get('/', async (req, res) => {
    res.send(`Chime Proxy Backend App`)
})

// Create a Chime Proxy Session
app.post('/proxySession', async (req, res) => {
    console.log("Entered post", req.body);
    res.set({
        'Access-Control-Allow-Origin': '*',
        'Access-Control-Allow-Methods': 'DELETE,GET,PATCH,POST,PUT',
        'Access-Control-Allow-Headers': 'Content-Type,Authorization'
    });
    //parse phone number from environment variables
    const userPhoneNumber = libphonenumber.parsePhoneNumberFromString(process.env.USER_NUMBER)
    const userCountry = userPhoneNumber.country;              
    const userArea = userPhoneNumber.nationalNumber.substring(0,3);
    
    var params = {
        DefaultSessionExpiryMinutes: process.env.EXPIRY_MINUTES,
        PhoneNumberPoolCountries: [userCountry,],
        VoiceConnectorId: process.env.VOICE_CONNECTOR_ID,
        };
    await chime.putVoiceConnectorProxy(params, (error, data) => {
        if (error) {
            console.log(error, error.stack);
            res.status(400).json({ error: error.message });
         } 
        console.log(data);
        }).promise();
    
    // Construct params to set up a proxy phone session
    var session_params = {
        Capabilities: [ "Voice", "SMS" ],
        ParticipantPhoneNumbers: [ 
            process.env.PROVIDER_NUMBER, 
            process.env.USER_NUMBER 
            ],
        VoiceConnectorId: process.env.VOICE_CONNECTOR_ID,
        ExpiryMinutes: parseInt(process.env.EXPIRY_MINUTES),
        GeoMatchParams: {
            AreaCode: userArea, 
            Country: userCountry 
        },
        Name: 'DemoProxy',
        NumberSelectionBehavior: 'PreferSticky'
    };

    var proxySessionResponse = await chime.createProxySession(session_params, (error, data) => {
        if (error) {
            console.log(error, error.stack);
            res.status(400).json({ error: error.message });
         } 
        console.log(data);
        }).promise();
    res.json({success: 'post call succeed!', url: req.url, body: proxySessionResponse.ProxySession})
  });

// Delete a Chime Proxy Session
app.delete('/proxySession/:proxySessionId', async (req, res) => {
    let proxySessionId = req.params.userId;
    console.log(req.params)
    var params = {
        ProxySessionId: proxySessionId, 
        VoiceConnectorId: process.env.VOICE_CONNECTOR_ID 
    };
    var deleteResponse = await chime.deleteProxySession(params, (error, data) => {
        if (error) {
            console.log(error, error.stack);
            res.status(400).json({ error: error.message });
         } 
        console.log(data);
    }).promise();
    console.log("Delete response is", deleteResponse);
    res.json({success: 'delete call succeed!', url: req.url});
})


module.exports.handler = serverless(app);