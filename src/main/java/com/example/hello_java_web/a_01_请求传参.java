package com.example.hello_java_web;


import com.example.hello_java_web.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class a_01_请求传参 {
    // 无参接口
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    // 参数接口
    @RequestMapping("/hello2")
    public String hello2(String name) {
        System.out.println("hello2" + name);
        return name;
    }

    // 参数接口
    @RequestMapping("/hello3")
    public String hello3(String name) {
        System.out.println("hello3" + name);
        return name;
    }

    // 实体参数
    @RequestMapping("/hello4")
    public String hello4(User user) {
        User user1 = user;
        System.out.println(user1.toString());
        return user1.toString();
    }

    // 数组参数
    @RequestMapping("/list")
    public String[] list(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        return names;
    }

    // List集合参数
    @RequestMapping("/list2")
    public List<String> list2(@RequestParam List<String> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
        return users;
    }

    // 日期参数
    @RequestMapping("/date")
    public LocalDateTime updateTimes(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date) {
        System.out.println(date);
        return date;
    }

    // json 参数
    @RequestMapping("/json")
    public User getUser(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    // 路径传参
    @RequestMapping("/path/{id}")
    public Integer getId(@PathVariable Integer id) {
        System.out.println(id);
        return id;
    }

    // 路径传参
    @RequestMapping("/path/{id}/{name}")
    public String getName(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "ok";
    }
}
