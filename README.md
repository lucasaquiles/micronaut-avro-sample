# POC using micronaut + kafka + avro  + micrometer


## Producer

`./gradlew run`

http request

`curl -X POST  "http://localhost:8080/rule" -H "Content-type: application/json" -d '{"name": "first-rule", "rule" : "(a+b) * 2", "description":"first example of a simple rule"}' ` 


`docker-compose -f kafka-template.yml up -d`

kafdrop

`http://localhost:9000`

## Consumer

receive a topic named `rule-created` and log output

`./gradlew run`

