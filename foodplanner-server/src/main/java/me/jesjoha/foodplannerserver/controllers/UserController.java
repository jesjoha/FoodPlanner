package me.jesjoha.foodplannerserver.controllers;

import me.jesjoha.foodplannerserver.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/new-user")
    public User newUser() {
        return new User("Jesper", "jesper@test.com", 36);
    }

    @GetMapping("/aaron")
    public User getUser() {
        return new User("Aaron", "aaron@wah.com", 4);
    }
}
