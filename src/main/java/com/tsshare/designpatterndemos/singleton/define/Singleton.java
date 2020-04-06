package com.tsshare.designpatterndemos.singleton.define;

/**
 * @author guabei
 * @title: Singleton
 * @projectName design-pattern-demos
 * @description: 单例类 - 饿汉式(线程安全)
 * @date 2020/4/623:36
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    // 私有的构造，限制唯一性
    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }

    //类中其他方法，尽量是static
    public static void doSomething() {
    }
}
