import boto3

x = None
x = True
x = {"y": "z", "a": 2}
x = [1, "2"]

# Create SQS client
sqs = boto3.client('sqs')

# List SQS queues
response = sqs.list_queues()

print(response['QueueUrls'])

def x(y, z=4, zz=5):
    print(x, y)

    def y():
        print("x")
