package com.example.hello_java_web.mapper;

import com.example.hello_java_web.pojo.User2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 注解会在运行时自动生成该接口的实现对象(代理),并交给ioc容器管理
public interface UserMapper {

    // mybatis 查询
    @Select("select * from user")
    List<User2> selectAllUser();

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Delete("delete from user where id = #{id}")
    Integer deleteById(int id);

    /**
     * 新增
     *
     * @param user
     */
    @Insert("insert into user(name,age,gender,phone) values (#{name},#{age},#{gender},#{phone})")
    void insertUser(User2 user);

    /**
     * 更新
     *
     * @param user
     */
    @Update("update user set name = #{name} , phone=#{phone} , age=#{age} , gender=#{gender} where id= #{id}")
    void upDateUserById(User2 user);


    // 登录 若基于springBoot官方创建的springBoot项目可以不写@Param("userName") 直接使用形参名称
    @Select("select * from user where name=#{userName} and password = #{password}")
    Integer login(@Param("userName") String name, @Param("password") String password);

}
