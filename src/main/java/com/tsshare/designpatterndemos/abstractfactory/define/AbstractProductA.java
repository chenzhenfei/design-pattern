package com.tsshare.designpatterndemos.abstractfactory.define;

import java.sql.SQLOutput;

/**
 * @author chenzhenfei
 * @title: AbstractProductA
 * @projectName design-pattern-demos
 * @description: productA
 * @date 2020/4/90:15
 */
public abstract class AbstractProductA {
    public void shareMethod(){
        System.out.println("共有方法");
    }
    // 抽象的
    public abstract void doSomething();
}
