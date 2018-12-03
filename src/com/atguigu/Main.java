package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //根据 xml 创建 IOC 容器
        ApplicationContext context=new  ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器获取Bean
        HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
        System.out.println("hello "+helloWorld.getName());

        //从IOC容器获取Car
        Car car=(Car) context.getBean("car");
        System.out.println(car);

        //
        Person person=(Person) context.getBean("person");
        System.out.println(person);

        NewPerson newPerson=(NewPerson) context.getBean("newPerson");
        System.out.println(newPerson);

    }
}
