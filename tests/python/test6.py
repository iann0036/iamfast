import boto3
from boto3.session import Session

session = Session()
s3 = session.resource('s3')
your_bucket = s3.Bucket('yourbucket')

for s3_file in your_bucket.objects.all():
    print(s3_file.key)

s32 = boto3.resource('s3')

your_bucket2 = s3.Bucket('yourbucket2')
print(your_bucket2.objects.all())
