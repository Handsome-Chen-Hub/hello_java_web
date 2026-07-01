package com.example.hello_java_web;

import com.example.hello_java_web.pojo.Emp;
import com.example.hello_java_web.pojo.Result;
import com.example.hello_java_web.service.EmpService;
import com.example.hello_java_web.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/csd")
public class a_04_三层架构 {
    // Controller 控制层
    // service    逻辑处理层
    // Dao        数据层

    private EmpService empService = new EmpServiceA();

    @RequestMapping("/listEmp")
    public Result empList() {
        List<Emp> listEmp = empService.listEmp();
        return Result.success(listEmp);
    }
}