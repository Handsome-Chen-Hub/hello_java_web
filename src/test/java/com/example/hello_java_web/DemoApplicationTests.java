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

    @Test
    public void delUserById() {
        Integer i = userMapper.deleteById(8);
        System.out.println(i);
    }

    @Test
    public void insertUser2() {
        User2 user = new User2(null, "张三", 23, 1, "122222");
        userMapper.insertUser(user);
    }

    @Test
    public void updateUser2() {
        User2 user = new User2(9, "张三", 25, 1, "1222333322");
        userMapper.upDateUserById(user);
    }

    @Test
    public void login() {
        Integer login = userMapper.login("张三", "123123");
        if (login > 0) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
