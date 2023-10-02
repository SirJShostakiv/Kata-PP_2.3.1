package app.service;

import app.dao.UserDAO;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDao;
    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Transactional
    @Override
    public List<User> read() {
        return userDao.read();
    }

    @Transactional
    @Override
    public void update(User user, int id) {
        userDao.update(user, id);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public User getByID(int id) { return userDao.getByID(id);}
}
