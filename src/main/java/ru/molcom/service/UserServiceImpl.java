package ru.molcom.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.molcom.dao.interfaces.UserDao;
import ru.molcom.entity.User;
import ru.molcom.service.interfaces.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getById(Long id) {
        return userDao.getbyId(id);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
