package com.atguigu.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

    private  String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 返回bean的对象
     * @return
     * @throws Exception
     */
    @Override
    public Car getObject() throws Exception {
        return new Car(brand,300000);
    }

    /**
     * 返回bean的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * 是否单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
