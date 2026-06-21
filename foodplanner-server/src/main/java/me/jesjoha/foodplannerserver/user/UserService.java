package me.jesjoha.foodplannerserver.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getAll();
    }

    public User getUserByName(String username) {
        return userRepository.getUserByUsername(username);
    }

    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public User removeUserById(int id) {
        return userRepository.removeUser(id);
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
