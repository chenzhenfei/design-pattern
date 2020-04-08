package com.tsshare.designpatterndemos.abstractfactory.define;

/**
 * @author chenzhenfei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景
 * @date 2020/4/90:26
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory creator1=new Creator1();
        AbstractFactory creator2=new Creator2();
        creator1.createProductA();
        creator1.createProductB();
        creator2.createProductA();
        creator2.createProductB();
        // ...
    }
}
