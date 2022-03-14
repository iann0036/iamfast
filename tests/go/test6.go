package main

import (
	"github.com/aws/aws-sdk-go/aws"
	"github.com/aws/aws-sdk-go/aws/session"
	"github.com/aws/aws-sdk-go/service/kms"

	"fmt"
	"os"
)

func thing() {
	// Initialize a session in us-west-2 that the SDK will use to load
	// credentials from the shared credentials file ~/.aws/credentials.
	sess, err := session.NewSession(&aws.Config{
		Region: aws.String("us-west-2")},
	)

	// Create KMS service client
	svc := kms.New(sess)

	// Encrypt data key
	//
	// Replace the fictitious key ARN with a valid key ID

	keyId := "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"

	// Encrypt the data
	result, err := svc.Encrypt(&kms.EncryptInput{
		KeyId:     aws.String(keyId),
		Plaintext: aws.String("1234567890"), // not real, should be []byte("...")
	})

	if err != nil {
		fmt.Println("Got error encrypting data: ", err)
		os.Exit(1)
	}

	result2, err := svc.Encrypt(&kms.EncryptInput{
		KeyId:     aws.String("2234abcd-12ab-34cd-56ef-1234567890ab"),
		Plaintext: aws.String("1234567890"), // not real, should be []byte("...")
	})

	if err != nil {
		fmt.Println("Got error encrypting data: ", err)
		os.Exit(1)
	}

	fmt.Println("Blob (base-64 byte array):")
	fmt.Println(result.CiphertextBlob)
	fmt.Println("Blob (base-64 byte array):")
	fmt.Println(result2.CiphertextBlob)
}
