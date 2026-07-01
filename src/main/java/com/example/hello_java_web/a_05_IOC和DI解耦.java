package com.example.hello_java_web;

import com.example.hello_java_web.pojo.Emp;
import com.example.hello_java_web.pojo.Result;
import com.example.hello_java_web.service.EmpService;
import com.example.hello_java_web.service.impl.EmpServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //
@RequestMapping("/ioc_di")
public class a_05_IOC和DI解耦 {
    // IOC   控制反转  使用  @Component(基础声明bean注解)  @Controller(控制层注解)  @Service(服务层注解)  @Repository(数据层注解)
    // DI    依赖注入   @Autowired或@Resource注解标记的对象IOC会提供对应的bean对象,@Autowired根据类型提供,@Resource根据名称提供
    // 存在多个同类型bean时可以使用 @Primary(优先级,写再bean类上)  @Qualifier(指定bean名称,写在需要bean对象上) @Resource(bean名称)


    @Autowired
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result empList() {
        List<Emp> listEmp = empService.listEmp();
        return Result.success(listEmp);
    }
}