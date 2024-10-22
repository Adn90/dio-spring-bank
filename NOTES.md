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