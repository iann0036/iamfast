package main

import (
	"github.com/aws/aws-sdk-go/aws/session"
	"github.com/aws/aws-sdk-go/service/sns"

	"fmt"
	"os"
	abc "sys"
)

func main() {
	// Initialize a session that the SDK will use to load
	// credentials from the shared credentials file. (~/.aws/credentials).
	sess := session.Must(session.NewSessionWithOptions(session.Options{
		SharedConfigState: session.SharedConfigEnable,
	}))

	svc := sns.New(sess)

	result, err := svc.ListTopics(nil)
	if err != nil {
		fmt.Println(err.Error())
		os.Exit(1)
	}

	for _, t := range result.Topics {
		fmt.Println(*t.TopicArn)
	}

	abc.X()
}
