package com.tsshare.designpatterndemos.singleton.define;

/**
 * @author guabei
 * @title: SingletonN
 * @projectName design-pattern-demos
 * @description: 单例 - 懒汉试(线程不安全的，可以通过方法增加syn 进行同步 )
 * @date 2020/4/623:43
 */
public class SingletonN {
    private static SingletonN singleton=null;
    // 私有的构造，限制唯一性
    private SingletonN() {

    }

    public static synchronized  SingletonN getInstance() {
        if(singleton==null){
            singleton = new SingletonN();
        }
        return singleton;
    }

    //类中其他方法，尽量是static
    public static void doSomething() {
    }
}
