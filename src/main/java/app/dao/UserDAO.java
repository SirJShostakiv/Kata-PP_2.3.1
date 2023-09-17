package app.dao;

import app.model.User;

import java.util.List;

public interface UserDAO {
    void create(User user);
    List<User> read();
    void update(User user, int id);
    void delete(int id);
    User getByID(int id);
}
