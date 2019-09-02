package ru.molcom.dao;

import ru.molcom.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

}
