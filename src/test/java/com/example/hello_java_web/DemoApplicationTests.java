package com.example.hello_java_web;

import com.example.hello_java_web.mapper.UserMapper;
import com.example.hello_java_web.pojo.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectAllUser() {
        List<User2> allUser = userMapper.selectAllUser();
        for (User2 user : allUser) {
            System.out.println(user.toString());
        }

    }

}
