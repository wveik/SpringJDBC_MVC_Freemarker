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

    public void save(User user) {
        String sql = "INSERT INTO public.userr(" +
                "name, email, age) " +
                "VALUES (?, ?, ?);";

        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    public User getbyId(Long id) {
        String sql = "SELECT * FROM userr WHERE id=?";

        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public void delete(Long id) {
        String sql = "DELETE FROM public.userr WHERE id=?;";

        jdbcTemplate.update(sql, id);
    }

    public void update(User user) {
        String sql = "UPDATE public.userr " +
                "SET name=?, email=?, age=? " +
                "WHERE id=?;";

        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }
}
