// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: MIT-0

var AWS = require('aws-sdk');

class Config {

    static instance;
    
    secret_key = "";

    namespace = "sap-monitor-hana";

    debug = false;

    host = "";
    instanceNumber = "";
    databaseName = "";
    user = "";
    password = "";

    constructor(resolve) {
      if (Config.instance) {
        return Config.instance;
      }
      Config.instance = this;
    }

    reset() {
        this.host = "";
        this.instanceNumber = "";
        this.databaseName = "";
        this.user = "";
        this.password = "";

        this.secret_key = "";
        this.debug = false;
    }
  
    readSecrets() {

        if( process.env.DEBUG != null) {
            this.debug = process.env.DEBUG;

            if(this.debug)
            console.log("DEBUG enabled!")
        }

        if (process.env.SECRET != null) {
            this.secret_key = process.env.SECRET;
        } else {
            throw "Environment Variable 'SECRET' not maintained. Exit!"
        }

        var that = this;

        return new Promise(function(resolve, reject) {

            if(that.host == "")
            {
                console.log("Read Secret "+that.secret_key+"...");

                try {
                

                    var client = new AWS.SecretsManager({});

                    client.getSecretValue({SecretId: that.secret_key}, function(err, data) {
                        var secret;
                        if (err) {
                            if (err.code === 'DecryptionFailureException')
                                throw err;
                            else if (err.code === 'InternalServiceErrorException')
                                throw err;
                            else if (err.code === 'InvalidParameterException')
                                throw err;
                            else if (err.code === 'InvalidRequestException')
                                throw err;
                            else if (err.code === 'ResourceNotFoundException')
                                throw err;
                        }
                        else {
                            if ('SecretString' in data) {
                                secret = JSON.parse(data.SecretString);
                            }
                        }

                        if(that.debug)
                        {
                            console.log(secret.host);
                            console.log(secret.name);
                        }

                        that.host = secret.host;
                        that.instanceNumber = secret.sys_id;
                        that.databaseName = secret.name;
                        that.user = secret.user;
                        that.password = secret.password;

                        resolve();
                    });
                } catch (error) {
                    throw "Secret "+that.secret_key+" could not be read! "+error;
                    reject();
                }
            }
            else
            {
                resolve();
            }

        });
    }
}

module.exports = Config;