import boto3
import boto3 as somethingelse
from boto3.session import Session
from boto3 import session as sessionroot

s3name = 's3'
s35 = Session().client(s3name)
s35.list_objects_v2(Bucket='yourbucket1')

sessionroot.Session().client('s3').list_objects_v2(Bucket='yourbucket2').keys()
