package com.atguigu.annotation;

import com.atguigu.annotation.controller.UserController;
import com.atguigu.annotation.repository.UserRepository;
import com.atguigu.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans-annotation.xml");
        TestObject to= (TestObject) context.getBean("testObject");
        System.out.println(to);

        UserController userController= (UserController) context.getBean("userController");
        System.out.println(userController);

        UserService userService= (UserService) context.getBean("userService");
        System.out.println(userService);

        //注意这里：由于repository是实现的接口，annotation标注在实现类上，默认是实现类的首字母小写，可以通过@Repository(value="")指定名称
        UserRepository userRepository= (UserRepository) context.getBean("userRepository");
        System.out.println(userRepository);
    }
}
