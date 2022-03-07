#!/bin/bash

echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/cloudformation/2010-05-15/resources-1.json`" > src/lib/py-cloudformation-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/cloudwatch/2010-08-01/resources-1.json`" > src/lib/py-cloudwatch-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/dynamodb/2012-08-10/resources-1.json`" > src/lib/py-dynamodb-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/ec2/2016-11-15/resources-1.json`" > src/lib/py-ec2-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/glacier/2012-06-01/resources-1.json`" > src/lib/py-glacier-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/iam/2010-05-08/resources-1.json`" > src/lib/py-iam-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/opsworks/2013-02-18/resources-1.json`" > src/lib/py-opsworks-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/s3/2006-03-01/resources-1.json`" > src/lib/py-s3-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/sns/2010-03-31/resources-1.json`" > src/lib/py-sns-service.js
echo "export default `curl -s https://raw.githubusercontent.com/boto/boto3/develop/boto3/data/sqs/2012-11-05/resources-1.json`" > src/lib/py-sqs-service.js
