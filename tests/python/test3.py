import boto3

# Create IAM client
iam = boto3.client('iam')

# Attach a role policy
iam.attach_role_policy(
    PolicyArn='arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess',
    RoleName='SomeRole'
)

myvar = 'AmazonDynamoDBFullAccess'

# Attach a role policy
iam.attach_role_policy(
    PolicyArn='arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess',
    RoleName=myvar
)

def somefunc(argvar):
    # Attach a role policy
    iam.attach_role_policy(
        PolicyArn='arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess',
        RoleName=argvar
    )

somefunc('argvalue1')
somefunc('argvalue2')
