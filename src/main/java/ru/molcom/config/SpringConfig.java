package ru.molcom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.molcom.dao.UserDaoImpl;
import ru.molcom.dao.interfaces.UserDao;
import ru.molcom.service.UserServiceImpl;
import ru.molcom.service.interfaces.UserService;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"ru.molcom.service", "ru.molcom.dao"})
public class SpringConfig {


    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:postgresql://localhost:5432/test");
        dataSource.setUsername("admin");
        dataSource.setPassword("123456");

        dataSource.setDriverClassName("org.postgresql.Driver");

        return dataSource;
    }

    @Bean
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
