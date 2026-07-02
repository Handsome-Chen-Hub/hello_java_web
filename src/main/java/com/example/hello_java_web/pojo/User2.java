package com.example.hello_java_web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 代替所有 get和set及toString方法
@NoArgsConstructor // 代替无参构造
@AllArgsConstructor// 代替有参构造
public class User2 {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private String phone;
}
