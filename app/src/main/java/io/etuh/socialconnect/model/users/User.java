package io.etuh.socialconnect.model.users;

import org.simpleframework.xml.Element;

public class User {
    @Element(name="id")
    private int id;

    @Element(name="username")
    private String username;

    @Element(name="email")
    private String email;

    public User(){}

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
