package me.jesjoha.foodplannerserver.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id) {
        return userService.removeUserById(id);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
