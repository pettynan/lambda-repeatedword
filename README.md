#Lambda RepeatedWord
  This function takes an input of a sentence (string) and returns the first repeated word from that sentence. This is deployed as a Lambda function which users can access through an AWS API Gateway.

## API
  Users can access this function at 
  https://z36bpcp02b.execute-api.us-west-2.amazonaws.com/string

  Example formatted query:
  https://z36bpcp02b.execute-api.us-west-2.amazonaws.com/string?sentence=This+query+will+return+the+word+this.

  Response will be the string "this".

## Technologies used
  Java
  Gradle
  AWS Lambda
  AWS API Gateway