#include <aws/core/Aws.h>
#include <aws/sns/SNSClient.h>
#include <aws/sns/model/ListTopicsRequest.h>
#include <aws/sns/model/ListTopicsResult.h>
#include <iostream>

int main(int argc, char ** argv)
{
  Aws::SDKOptions options;
  Aws::InitAPI(options);
  {
    Aws::SNS::SNSClient sns;

    Aws::SNS::Model::ListTopicsRequest lt_req;

    auto lt_out = sns.ListTopics(lt_req);

    if (lt_out.IsSuccess())
    {
      std::cout << "Topics list:" << std::endl;
      for (auto const &topic : lt_out.GetResult().GetTopics())
      {
        std::cout << "  * " << topic.GetTopicArn() << std::endl;
      }
    }
    else
    {
      std::cout << "Error listing topics " << lt_out.GetError().GetMessage() <<
        std::endl;
    }
  }

  Aws::ShutdownAPI(options);

  return 0;
}