package com.example.hello_java_web.mapper;

import com.example.hello_java_web.pojo.User2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 注解会在运行时自动生成该接口的实现对象(代理),并交给ioc容器管理
public interface UserMapper {

    @Select("select * from user")
    List<User2> selectAllUser();
}
