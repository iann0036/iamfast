#!/usr/bin/env/python
import boto3
import logging
from botocore.exceptions import ClientError
from botocore.client import Config

config = Config(
   signature_version = 's3v4'
)

s3_client = boto3.client('sts',
        aws_access_key_id='s3_key',
        aws_secret_access_key='s3_secret',
        config=config,
        region_name='us-east-1')

try:

  response = s3_client.assume_role(
      RoleArn='arn:x:ignored:by:weka-s3:',
      RoleSessionName='ignored-by-weka-s3',
      DurationSeconds=900
  )

except ClientError as e:
    logging.error(e)

print('AccessKeyId:' + response['Credentials']['AccessKeyId'])
print('SecretAccessKey:' + response['Credentials']['SecretAccessKey'])
print('SessionToken:' + response['Credentials']['SessionToken'])