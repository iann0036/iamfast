'use strict'

import * as fs from "fs";
import * as chai from "chai";
const expect = chai.expect;

import IAMFast from "../src/IAMFast.js";


const generatePolicyAsJson = (filePath, awsAccountId = "123456789012") => {
    const sut = new IAMFast("aws", "us-east-1", awsAccountId);
    
    let language = IAMFast.getLanguageByPath(filePath);

    let code = fs.readFileSync(filePath, { encoding: 'utf8', flag: 'r' });
    let policy = sut.GenerateIAMPolicy(code, language);
    return JSON.parse(policy);
}

const generatePolicyAsHcl = (filePath, awsAccountId = "123456789012") => {
    const sut = new IAMFast("aws", "us-east-1", awsAccountId);
    
    let language = IAMFast.getLanguageByPath(filePath);

    let code = fs.readFileSync(filePath, { encoding: 'utf8', flag: 'r' });
    let template = sut.GenerateHCLTemplate(code, language);
    return template;
}


describe('main.js', function () {
    this.timeout(10000);
    
    describe('generateIAMPolicy', () => {
        it('should produce a valid iam definition for DynamoDB (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test1.json");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "dynamodb:GetItem",
                        "Resource": [
                            "arn:aws:dynamodb:us-east-1:123456789012:table/Boo"
                        ]
                    }
                ]
            }
            )
        })
        it('should produce a valid iam definition for sync stepfunction call (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test2.json");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "states:StartExecution",
                        "Resource": [
                            "arn:aws:states:us-east-1:123456789012:stateMachine:statemachine-name"
                        ]
                    },
                    {
                        "Action": "events:PutRule",
                        "Effect": "Allow",
                        "Resource": [
                        "arn:aws:events:us-east-1:123456789012:rule/StepFunctionsGetEventsForStepFunctionsExecutionRule"
                        ]
                    },
                    {
                        "Action": "events:PutTargets",
                        "Effect": "Allow",
                        "Resource": [
                        "arn:aws:events:us-east-1:123456789012:rule/StepFunctionsGetEventsForStepFunctionsExecutionRule"
                        ]
                    },
                    {
                        "Action": "events:DescribeRule",
                        "Effect": "Allow",
                        "Resource": [
                        "arn:aws:events:us-east-1:123456789012:rule/StepFunctionsGetEventsForStepFunctionsExecutionRule"
                        ]
                    }
                ]
            }
            )
        })
        it('should produce a valid iam definition for direct lambda call (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test3.json");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "lambda:InvokeFunction",
                        "Resource": [
                            "arn:aws:lambda:us-east-1:123456789012:function:HelloFunction"
                        ]
                    }, 
                ]
            }
            )
        })
        it('should produce a valid iam definition for API GW Invoke (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test4.json");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "execute-api:Invoke",
                        "Resource": [
                            "arn:aws:execute-api:us-east-1:123456789012:*/prod/GET/*"
                        ]
                    }, 
                ]
            }
            )
        })
        it('should allow CDK Token to be passed as account ID (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test4.json", "${Token[AWS.AccountId.0]}");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "execute-api:Invoke",
                        "Resource": [
                            "arn:aws:execute-api:us-east-1:${Token[AWS.AccountId.0]}:*/prod/GET/*"
                        ]
                    }, 
                ]
            }
            )
        })
        it('should collect permissions from within ASL Parallel (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test5.json", "123123123123");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "lambda:InvokeFunction",
                        "Resource": [
                            "arn:aws:lambda:us-east-1:123123123123:function:function-name"
                        ]
                    }, 
                ]
            }
            )
        })
        it('should translate a ts2asl replacement in resource to function * (ASL)', () => {
            let policy = generatePolicyAsJson("./tests/asl/test6.json", "123123123123");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "lambda:InvokeFunction",
                        "Resource": [
                            //todo: might be better to a) replace [!lambda[xxxxx]arn] with [!lambda[xxxx]name] and pass it down the FunctionName (or!) replace region & accountId with * 
                            "arn:aws:lambda:us-east-1:123123123123:function:*" 
                        ]
                    }, 
                ]
            }
            )
        })
        it('should produce a valid iam definition for DynamoDB (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test1.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for S3 (generic resource) (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test2.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for EC2 (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test3.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for S3 (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test4.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for Chime (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test5.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for API GW (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test6.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for ECR (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test7.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for Route53 (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test8.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for SQS and Lambda (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test9.js");
            expect(policy).to.deep.equal({
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
        it('should produce a valid iam definition for TBC (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test10.js");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "tbc:TBC",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for TBC, outputting as HCL (JavaScript)', () => {
            let policy = generatePolicyAsHcl("./tests/js/test10.js");
            expect(policy).to.deep.equal(`data "aws_caller_identity" "current" {}
data "aws_region" "current" {}

locals {
  account_id = data.aws_caller_identity.current.account_id
  region = data.aws_region.current.name
}

variable "TableName" {
  type = string
}

data "aws_iam_policy_document" "my_policy" {
  statement {
    effect = "Allow"
    actions = [
      "dynamodb:GetItem",
    ]
    resources = [
      "arn:aws:dynamodb:\${local.region}:\${local.account_id}:table/\${var.TableName}",
    ]
  }

  statement {
    effect = "Allow"
    actions = [
      "dynamodb:PutItem",
    ]
    resources = [
      "arn:aws:dynamodb:\${local.region}:\${local.account_id}:table/\${var.TableName}",
    ]
  }

  statement {
    effect = "Allow"
    actions = [
      "dynamodb:DeleteItem",
    ]
    resources = [
      "arn:aws:dynamodb:\${local.region}:\${local.account_id}:table/\${var.TableName}",
    ]
  }
}`)
        })
        it('should produce a valid iam definition for TBC (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test11.js");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "tbc:TBC",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for TBC (JavaScript)', () => {
            let policy = generatePolicyAsJson("./tests/js/test12.js");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "tbc:TBC",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for SQS (Python)', () => {
            let policy = generatePolicyAsJson("./tests/python/test1.py");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sqs:ListQueues",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test2.py) (Python)', () => {
            let policy = generatePolicyAsJson("./tests/python/test2.py");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "tbc:TBC",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test3.py) (Python)', () => {
            let policy = generatePolicyAsJson("./tests/python/test3.py");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "iam:AttachRolePolicy",
                        "Resource": [
                            "arn:aws:iam::123456789012:role/SomeRole",
                            "arn:aws:iam::123456789012:role/SomeVariableRoleName",
                            "arn:aws:iam::123456789012:role/argvalue1",
                            "arn:aws:iam::123456789012:role/argvalue2"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test4.py) (Python)', () => {
            let policy = generatePolicyAsJson("./tests/python/test4.py");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sts:AssumeRole",
                        "Resource": [
                            "arn:aws:iam::123456789012:role/myrole"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test5.py) (Python)', () => {
            let policy = generatePolicyAsJson("./tests/python/test5.py");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "s3:CreateBucket",
                        "Resource": [
                            "arn:aws:s3:::newbucket"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for SNS (Java)', () => {
            let policy = generatePolicyAsJson("./tests/java/test1.java");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sns:ListTopics",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test2.java) (Java)', () => {
            let policy = generatePolicyAsJson("./tests/java/test2.java");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "ec2:StartInstances",
                        "Resource": [
                            "arn:aws:ec2:us-east-1:123456789012:instance/*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "ec2:StopInstances",
                        "Resource": [
                            "arn:aws:ec2:us-east-1:123456789012:instance/*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test3.java) (Java)', () => {
            let policy = generatePolicyAsJson("./tests/java/test3.java");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "cloudtrail:CreateTrail",
                        "Resource": [
                            "arn:aws:cloudtrail:us-east-1:123456789012:trail/*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for SNS (Go)', () => {
            let policy = generatePolicyAsJson("./tests/go/test1.go");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sns:ListTopics",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test2.go) (Go)', () => {
            let policy = generatePolicyAsJson("./tests/go/test2.go");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "ec2:RunInstances",
                        "Resource": [
                            "arn:aws:ec2:us-east-1::image/*",
                            "arn:aws:ec2:us-east-1:123456789012:instance/*",
                            "arn:aws:ec2:us-east-1:123456789012:network-interface/*",
                            "arn:aws:ec2:us-east-1:123456789012:security-group/*",
                            "arn:aws:ec2:us-east-1:123456789012:subnet/*",
                            "arn:aws:ec2:us-east-1:123456789012:volume/*",
                            "arn:aws:ec2:us-east-1:123456789012:elastic-gpu/*",
                            "arn:aws:elastic-inference:us-east-1:123456789012:elastic-inference-accelerator/*"
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
        it('should produce a valid iam definition (test3.go) (Go)', () => {
            let policy = generatePolicyAsJson("./tests/go/test3.go");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sts:GetCallerIdentity",
                        "Resource": [
                            "*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "s3:PutBucketPolicy",
                        "Resource": [
                            "arn:aws:s3:::*"
                        ]
                    },
                    {
                        "Effect": "Allow",
                        "Action": "cloudtrail:CreateTrail",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition for SNS (C++)', () => {
            let policy = generatePolicyAsJson("./tests/cplusplus/test1.cpp");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "sns:ListTopics",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test2.cpp) (C++)', () => {
            let policy = generatePolicyAsJson("./tests/cplusplus/test2.cpp");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "cloudwatch:ListMetrics",
                        "Resource": [
                            "*"
                        ]
                    }
                ]
            })
        })
        it('should produce a valid iam definition (test3.cpp) (C++)', () => {
            let policy = generatePolicyAsJson("./tests/cplusplus/test3.cpp");
            expect(policy).to.deep.equal({
                "Version": "2012-10-17",
                "Statement": [
                    {
                        "Effect": "Allow",
                        "Action": "ec2:RunInstances",
                        "Resource": [
                            "arn:aws:ec2:us-east-1::image/*",
                            "arn:aws:ec2:us-east-1:123456789012:instance/*",
                            "arn:aws:ec2:us-east-1:123456789012:network-interface/*",
                            "arn:aws:ec2:us-east-1:123456789012:security-group/*",
                            "arn:aws:ec2:us-east-1:123456789012:subnet/*",
                            "arn:aws:ec2:us-east-1:123456789012:volume/*",
                            "arn:aws:ec2:us-east-1:123456789012:elastic-gpu/*",
                            "arn:aws:elastic-inference:us-east-1:123456789012:elastic-inference-accelerator/*"
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
    })
})