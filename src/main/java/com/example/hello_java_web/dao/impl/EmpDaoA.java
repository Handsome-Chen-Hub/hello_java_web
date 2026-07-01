package com.example.hello_java_web.dao.impl;

import com.example.hello_java_web.dao.EmpDao;
import com.example.hello_java_web.pojo.Emp;
import com.example.hello_java_web.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> findAll() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getPath();
        return XmlParserUtils.parse(file, Emp.class);
    }
}
