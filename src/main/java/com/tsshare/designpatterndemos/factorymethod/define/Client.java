package com.tsshare.designpatterndemos.factorymethod.define;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/70:04
 */
public class Client {
    public static void main(String[] args) {
        Creator creator =new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProductA.class);
        product.method1();
        product.method2();
    }
}
