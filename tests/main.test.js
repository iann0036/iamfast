'use strict'

const fs = require("fs");
const chai = require('chai')
const expect = chai.expect

const IAMFast = require("../main");
const sut = new IAMFast("aws", "us-east-1", "123456789012");


const generatePolicyAsJson = (filePath) => {
    let code = fs.readFileSync(filePath, { encoding: 'utf8', flag: 'r' });
    let policy = sut.generateIAMPolicy(code);
    return JSON.parse(policy);
}


describe('main.js', function () {
    describe('generateIAMPolicy', () => {
        it('should produce a valid iam definition for DynamoDB', () => {
            let dynamoPolicy = generatePolicyAsJson("./tests/test1.js");
            expect(dynamoPolicy).to.deep.equal({
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
            })
        })
        it('should produce a valid iam definition for S3 (generic resource)', () => {
            let s3Policy = generatePolicyAsJson("./tests/test2.js");
            expect(s3Policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "s3:ListAllMyBuckets",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for EC2', () => {
            let ec2Policy = generatePolicyAsJson("./tests/test3.js");
            expect(ec2Policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "ec2:RunInstances",
                        "Resource": [
                            "arn:aws:ec2:us-east-1::image/AMI_ID",
                            "arn:aws:ec2:us-east-1:123456789012:instance/*",
                            "arn:aws:ec2:us-east-1:123456789012:network-interface/*",
                            "arn:aws:ec2:us-east-1:123456789012:security-group/*",
                            "arn:aws:ec2:us-east-1:123456789012:subnet/*",
                            "arn:aws:ec2:us-east-1:123456789012:volume/*",
                            "arn:aws:ec2:us-east-1:123456789012:elastic-gpu/*",
                            "arn:aws:elastic-inference:us-east-1:123456789012:elastic-inference-accelerator/*",
                            "arn:aws:ec2:us-east-1:123456789012:key-pair/KEY_PAIR_NAME"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "ec2:CreateTags",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for S3', () => {
            let s3Policy = generatePolicyAsJson("./tests/test4.js");
            expect(s3Policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "s3:GetObject",
                        "Resource": [
                            "arn:aws:s3:::*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for Chime', () => {
            let chimePolicy = generatePolicyAsJson("./tests/test5.js");
            expect(chimePolicy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "chime:PutVoiceConnectorProxy",
                        "Resource": [
                            "*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "chime:CreateProxySession",
                        "Resource": [
                            "*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "chime:DeleteProxySession",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            }
            )
        })
        it('should produce a valid iam definition for API GW', () => {
            let apiGWPolicy = generatePolicyAsJson("./tests/test6.js");
            expect(apiGWPolicy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "apigateway:DELETE",
                        "Resource": [
                            "arn:aws:apigateway:us-east-1::/restapis/*/integration",
                            "arn:aws:apigateway:us-east-1::/restapis/models/*/template",
                            "arn:aws:apigateway:us-east-1::/usageplans/myusageplanid",
                            "arn:aws:apigateway:us-east-1::/apis/*/accesslogsettings",
                            "arn:aws:apigateway:us-east-1::/apis/*/cache/authorizers",
                            "arn:aws:apigateway:us-east-1::/apis/*/cors"
                        ]
                    }
                ]
            }
            )
        })
        it('should produce a valid iam definition for ECR', () => {
            let ecrPolicy = generatePolicyAsJson("./tests/test7.js");
            expect(ecrPolicy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "ecr:ListTagsForResource",
                        "Resource": [
                            "arn:aws:ecr:us-east-1:123456789012:repository/*"
                        ]
                    }
                ]
            }

            )
        })
        it('should produce a valid iam definition for Route53', () => {
            let route53Policy = generatePolicyAsJson("./tests/test8.js");
            expect(route53Policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "route53:ChangeResourceRecordSets",
                        "Resource": [
                            "arn:aws:route53:::hostedzone/*"
                        ]
                    }
                ]
            }
            )
        })
        it('should produce a valid iam definition for SQS and Lambda', () => {
            let route53Policy = generatePolicyAsJson("./tests/test9.js");
            expect(route53Policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "lambda:InvokeFunction",
                        "Resource": [
                            "arn:aws:lambda:us-east-1:123456789012:function:*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "sqs:DeleteMessage",
                        "Resource": [
                            "arn:aws:sqs:us-east-1:123456789012:*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "sqs:ReceiveMessage",
                        "Resource": [
                            "arn:aws:sqs:us-east-1:123456789012:*"
                        ]
                    }
                ]
            })
        })
    })
})