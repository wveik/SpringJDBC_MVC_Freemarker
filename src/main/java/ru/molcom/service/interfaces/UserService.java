package ru.molcom.service.interfaces;

import ru.molcom.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User getById(Long id);

    void delete(Long id);

    void update(User user);

}
