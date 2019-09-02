package ru.molcom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.molcom.dao.interfaces.UserDao;
import ru.molcom.entity.User;
import ru.molcom.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        String sql = "SELECT * FROM userr";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
