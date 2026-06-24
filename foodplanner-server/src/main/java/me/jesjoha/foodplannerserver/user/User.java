package me.jesjoha.foodplannerserver.user;

public class User {
    private int id;
    private String email;
    private String password_hash;

    public User(int id, String email, String password_hash) {
        this.id = id;
        this(email, password_hash);
    }

    public User(String email, String password_hash) {
        this.email = email;
        this.password_hash = password_hash;
    }
    public User() {}

    public String getEmail() {
        return email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }
}
