package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.resource.UserRequest;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping({"/user"})
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(this.userRepository.findAll());
    }

    @PostMapping({"/user"})
    public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setAddress(userRequest.getAddress());
        return ResponseEntity.status(201).body((User)this.userRepository.save(user));
    }

    @GetMapping({"/user/{username}"})
    public ResponseEntity getUsersByUsername(@PathVariable String username) {
        Optional<User> user = Optional.ofNullable(this.userRepository.findByUsername(username));
        return user.isPresent() ? ResponseEntity.ok((User)user.get()) : ResponseEntity.ok("The user with username: " + username + " was not found");
    }

    @DeleteMapping({"/user/{name}"})
    public ResponseEntity deleteUsersByName(@PathVariable String name) {
        Optional<User> user = Optional.ofNullable(this.userRepository.findByName(name));
        if (user.isPresent()) {
            this.userRepository.deleteByName(name);
            return ResponseEntity.ok("Succesfully Deleted");
        } else {
            return ResponseEntity.ok("The user with name: " + name + " was not found");
        }
    }
}
