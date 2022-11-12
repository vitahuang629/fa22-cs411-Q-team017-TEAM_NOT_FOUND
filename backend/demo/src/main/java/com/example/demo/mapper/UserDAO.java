package com.example.demo.mapper;

import com.example.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class UserDAO {

    @Autowired
    public JdbcTemplate jdbcTemplate;


    public void addUser() {

        User user = User.builder().
                user_id(15).password("123a").build();
        jdbcTemplate.update
                ("insert into user values(?,?)",
                        new Object[]{user.getId(), user.getPassword()}
                );
        log.info("user :{} added",user);
    }
}
