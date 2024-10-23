```java
@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreate) {
        User userCreated = userService.create(userToCreate);
        // o locatiion, faz com que esse campo na resposta, location, seja criado
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}") // id já mapeado no get pelo método findById
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
```

connection: keep-alive
content-type: application/json
date: Mon,21 Oct 2024 21:55:04 GMT
keep-alive: timeout=60
location: http://localhost:8080/users/1
transfer-encoding: chunked 


```Json
{
  "id": 0,
  "name": "John Doe",
  "account": {
    "number": "123456789",
    "agency": "001",
    "balance": 1500.75,
    "limit": 5000
  },
  "features": [
    {
      "icon": "🔒",
      "description": "Secure login"
    },
    {
      "icon": "📈",
      "description": "Real-time transaction alerts"
    }
  ],
  "card": {
    "number": "4111111111111111",
    "limit": 2000
  },
  "news": [
    {
      "icon": "📰",
      "description": "New features coming soon!"
    },
    {
      "icon": "⚡",
      "description": "Get 10% off on your next purchase."
    }
  ]
}

```