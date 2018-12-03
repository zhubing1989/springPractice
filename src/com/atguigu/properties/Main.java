package com.atguigu.properties;

import com.atguigu.Car;
import com.atguigu.HelloWorld;
import com.atguigu.NewPerson;
import com.atguigu.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //根据 xml 创建 IOC 容器
        ApplicationContext context=new  ClassPathXmlApplicationContext("beans-properties.xml");

        DataSource dataSource= (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.getConnection());

    }
}
