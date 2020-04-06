package com.tsshare.designpatterndemos.decorator.define;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/621:32
 */
public class Client {
    public static void main(String[] args) {
        Component component=null;
        component =new ConcreatComponent();
        //第一次修饰
        component =new DecoratorA(component);
        //第二次修饰
        component =new DecoratorB(component);
        component.opertion();
    }
}
