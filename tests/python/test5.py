#!/usr/bin/env/python
import boto3
import logging
from botocore.exceptions import ClientError
from botocore.client import Config

config = Config(
   signature_version = 's3v4'
)

s3_client = boto3.client('s3',
                         aws_access_key_id='s3_key',
                         aws_secret_access_key='s3_secret',
                         config=config)


try:
  s3_client.create_bucket(Bucket='newbucket')
except ClientError as e:
        logging.error(e)
