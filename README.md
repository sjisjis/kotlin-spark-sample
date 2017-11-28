```
./gradlew run
curl -s http://localhost:4567/tasks -X POST -d '{"content":"test1"}' | jq
curl -s http://localhost:4567/tasks | jq
curl -s http://localhost:4567/:id -X GET | jq
curl -s http://localhost:4567/:id -X DELETE | jq
curl -s http://localhost:4567/:id -X PATCH -d '{"content":"change1", "done":true}' | jq
```
