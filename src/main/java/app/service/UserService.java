package app.service;

import app.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    void create(User user);
    List<User> read();
    void update(User user, int id);
    void delete(int id);

    User getByID(int id);
    List<Integer> getIdList();
}
