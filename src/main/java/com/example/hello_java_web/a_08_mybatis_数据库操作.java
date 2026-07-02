package com.example.hello_java_web;

import org.springframework.stereotype.Controller;


@Controller //
public class a_08_mybatis_数据库操作 {
    // maven 导入 mybatis
    // application.properties配置 JDBC
    // 准备实体类pojo.User2
    // 定义User接口包 使用lombok在pojo中代替以前的git和set等简化代码
    // 单元测试中测试代码

    // SQL语句可以卸载mapper接口上面,也可以通过xml文件进行映射写道xml文件 简单的用注解,复杂的用xml
    // xml 规则:
    // 1.映射文件名称和接口名称需要一致,且xml文件是放在resources下的,且要和mapper接口同包或者配置映射地址  mybatis.mapper-locations=classpath:mapper/*.xml
    // 2.映射文件的namespace属性要和接口包地址一致如(com.example.hello_java_web.mapper.UserMapper)
    // 3.映射文件中sql语句的id与Mapper 接口中的方法名一致 且返回也是一致

}