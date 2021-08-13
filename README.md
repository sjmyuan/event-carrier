# Event Carrier

This repo is to demonstrate how to implement hexagonal architecture in Scala.

## Features

### Fetch pagination events from an API and forward the events to a SQS

Pagination API schema looks like this:

```json
{
    "_links": {
        "self": "https://xxx/",
        "next": "https://xxxx/",
        "prev": "https://xx"
    },
    "events": [
        {"id":1}
        {"id":2}
        {"id":3}
    ]
}
```
