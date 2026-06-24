package me.jesjoha.foodplannerserver.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("postgres") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getAll();
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
