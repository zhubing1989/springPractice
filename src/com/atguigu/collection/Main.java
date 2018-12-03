package com.atguigu.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person) context.getBean("person3");

        System.out.println(person);

        DataSource dataSource=context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
