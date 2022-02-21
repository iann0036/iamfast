const AWS = require('aws-sdk')

function prepareOptions(config) {
    return {
        accessKeyId: config['AWS_ID'],
        secretAccessKey: config['AWS_SECRET'],
        region: config['AWS_REGION']
    }
}


module.exports = (config, ip) => {
    const awsOpts = prepareOptions(config)
    const route53 = new AWS.Route53(awsOpts)
    // let route53 = new AWS.Route53(awsOpts)
    let newRoute53Config = {
        HostedZoneId: config['ROUTE53_ID'],
        ChangeBatch: {
            Changes: [
                {
                    Action: 'UPSERT',
                    ResourceRecordSet: {
                        Name: config['ROUTE53_RECORD'],
                        Type: 'A',
                        TTL: config['TTL'],
                        ResourceRecords: [
                            {
                                Value: ip
                            }
                        ]
                    }
                }
            ]
        }
    }
    route53.changeResourceRecordSets(newRoute53Config, (er, data) => {
        if (er) console.log(er)
        if (data) console.log(JSON.stringify(data))
    })
}