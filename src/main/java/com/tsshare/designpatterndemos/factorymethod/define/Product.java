package com.tsshare.designpatterndemos.factorymethod.define;

/**
 * @author guabei
 * @title: Product
 * @projectName design-pattern-demos
 * @description: 抽象产品类 -负责定义产品的共性
 * @date 2020/4/623:59
 */
public abstract class Product {
    public void method1() {
        //业务逻辑处理
    }
    //抽象方法
    public abstract void method2();
}