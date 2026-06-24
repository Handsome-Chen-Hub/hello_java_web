package com.example.hello_java_web;

import com.example.hello_java_web.pojo.Result;
import com.example.hello_java_web.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/result")
public class a_02_统一响应结果 {

    // 无参接口
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("hello");
        return Result.success();
    }

    // 参数接口
    @RequestMapping("/hello2")
    public Result hello2(String name) {
        System.out.println("hello2" + name);
        return Result.success(name);
    }

    // 参数接口
    @RequestMapping("/hello3")
    public Result hello3(String name) {
        System.out.println("hello3" + name);
        return Result.success(name);
    }

    // 实体参数
    @RequestMapping("/hello4")
    public Result hello4(User user) {
        System.out.println(user.toString());
        return Result.success(user);
    }

    // 数组参数
    @RequestMapping("/list")
    public Result list(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
        return Result.success(names);
    }

    // List集合参数
    @RequestMapping("/list2")
    public Result list2(@RequestParam List<String> users) {
        for (String user : users) {
            System.out.println(user);
        }
        return Result.success(users);
    }

    // 日期参数
    @RequestMapping("/date")
    public Result updateTimes(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date) {
        System.out.println(date);
        return Result.success(date);
    }

    // json 参数
    @RequestMapping("/json")
    public Result getUser(@RequestBody User user) {
        System.out.println(user);
        return Result.success(user);
    }

    // 路径传参
    @RequestMapping("/path/{id}")
    public Result getId(@PathVariable Integer id) {
        System.out.println(id);
        return Result.success(id);
    }

    // 路径传参
    @RequestMapping("/path/{id}/{name}")
    public Result getName(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return Result.success("id: " + id + ", name: " + name);
    }
}