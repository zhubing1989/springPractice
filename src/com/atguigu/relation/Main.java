package com.atguigu.relation;

import com.atguigu.Car;
import com.atguigu.HelloWorld;
import com.atguigu.NewPerson;
import com.atguigu.Person;
import com.atguigu.autowaire.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //根据 xml 创建 IOC 容器
        ApplicationContext context=new  ClassPathXmlApplicationContext("beans-relation.xml");
        Address address=(Address) context.getBean("address");
        System.out.println(address);
    }
}
