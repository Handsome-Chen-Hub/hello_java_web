package com.example.hello_java_web.mapper;

import com.example.hello_java_web.pojo.User2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 注解会在运行时自动生成该接口的实现对象(代理),并交给ioc容器管理
public interface UserMapper {

    // mybatis 查询
    @Select("select * from user")
    List<User2> selectAllUser();

    @Delete("delete from user where id = #{id}")
    Integer deleteById(int id);

    @Insert("insert into user(name,age,gender,phone) values (#{name},#{age},#{gender},#{phone})")
    Integer insertUser(User2 user);

    @Update("update user set name = #{name} , phone=#{phone} , age=#{age} , gender=#{gender} where id= #{id}")
    Integer upDateUserById(User2 user);

    @Select("select * from user where name=#{userName} and password = #{password}")
    Integer login(@Param("userName") String name, @Param("password") String password);

}
