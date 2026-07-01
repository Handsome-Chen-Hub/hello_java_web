package com.example.hello_java_web.dao.impl;

import com.example.hello_java_web.dao.EmpDao;
import com.example.hello_java_web.pojo.Emp;
import com.example.hello_java_web.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // 将EmpDaoB类交给IOC容器,成为IOC容器中的bean
public class EmpDaoB implements EmpDao {

    @Override
    public List<Emp> findAll() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getPath();
        return XmlParserUtils.parse(file, Emp.class);
    }
}
