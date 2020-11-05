package pl.coderslab.model;

import java.util.Objects;

public class User {
    private String name;
    private int id;

    public User(){

    }

    public User(User user) {
        this.id=user.id;
        this.name = user.getName();
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
