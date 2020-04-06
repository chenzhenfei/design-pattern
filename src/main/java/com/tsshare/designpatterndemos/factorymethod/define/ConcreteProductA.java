package com.tsshare.designpatterndemos.factorymethod.define;

/**
 * @author guabei
 * @title: ConcreteProductA
 * @projectName design-pattern-demos
 * @description: 产品A的具体实现类
 * @date 2020/4/70:02
 */
public class ConcreteProductA extends Product {

    @Override
    public void method1() {
        //业务逻辑处理
        System.out.println("产品A:"+"方法1");
    }

    @Override
    public void method2() {
        //业务逻辑处理
        System.out.println("产品A:"+"方法2");
    }
}
