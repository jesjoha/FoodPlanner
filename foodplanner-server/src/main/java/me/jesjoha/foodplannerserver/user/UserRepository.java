package me.jesjoha.foodplannerserver.user;

import java.util.List;

public interface UserRepository {

    void addUser(User user);

    User removeUser(int id);

    List<User> getAll();

    User getUserById(int id);

}
