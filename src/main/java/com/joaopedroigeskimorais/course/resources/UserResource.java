package com.joaopedroigeskimorais.course.resources;

import com.joaopedroigeskimorais.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("Joao", "joao@gmail.com", "999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
