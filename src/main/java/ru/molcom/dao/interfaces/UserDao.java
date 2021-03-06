package ru.molcom.dao.interfaces;

import ru.molcom.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    void save(User user);

    User getbyId(Long id);

    void delete(Long id);

    void update(User user);

}
