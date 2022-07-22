package com.security;

import com.security.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("welcome")
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("login")
    public ResponseEntity<User> login(@RequestBody User user) {
        return ResponseEntity.ok(user);
    }
}
