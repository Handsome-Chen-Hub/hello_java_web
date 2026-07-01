package com.example.hello_java_web.dao;

import com.example.hello_java_web.pojo.Emp;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public interface EmpDao {
    @GetMapping
    public List<Emp> findAll();
}
