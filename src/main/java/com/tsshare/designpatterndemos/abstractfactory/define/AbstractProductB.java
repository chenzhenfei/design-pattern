package com.tsshare.designpatterndemos.abstractfactory.define;

/**
 * @author chenzhenfei
 * @title: AbstractProductA
 * @projectName design-pattern-demos
 * @description: productB
 * @date 2020/4/90:15
 */
public abstract class AbstractProductB {
    public void shareMethod(){
        System.out.println("共有方法");
    }
    // 抽象的
    public abstract void doSomething();
}
