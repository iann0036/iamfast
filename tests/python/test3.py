import boto3

# Create IAM client
iam = boto3.client('iam')

# Attach a role policy
iam.attach_role_policy(
    PolicyArn='arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess',
    RoleName='AmazonDynamoDBFullAccess'
)
