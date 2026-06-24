package me.jesjoha.foodplannerserver.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("InMemory")
public class InMemoryUserRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User removeUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
