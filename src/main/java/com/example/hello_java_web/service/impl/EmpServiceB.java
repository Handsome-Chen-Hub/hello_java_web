package com.example.hello_java_web.service.impl;

import com.example.hello_java_web.dao.EmpDao;
import com.example.hello_java_web.dao.impl.EmpDaoA;
import com.example.hello_java_web.pojo.Emp;
import com.example.hello_java_web.service.EmpService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 将EmpServiceB类交给IOC容器,成为IOC容器中的bean
public class EmpServiceB implements EmpService {

    @Resource // 运行时由IOC容器提供EmpDao的bean对象
    private EmpDao empDao ;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.findAll();
        for (Emp emp : empList) {
            // 处理性别
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else {
                emp.setGender("女");
            }
            // 处理 角色
            String job = emp.getJob();
            switch (job) {
                case "1": {
                    emp.setJob("讲师");
                    break;
                }
                case "2": {
                    emp.setJob("班主任");
                    break;
                }
                case "3": {
                    emp.setJob("就业指导");
                    break;
                }
                default: {
                }
            }
        }
        return empList;
    }
}
