package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: SingletonStaticClass
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2121:49
 */
public class SingletonStaticClass {
    private SingletonStaticClass(){
    }

    public static SingletonStaticClass getInstance(){
        return SingletonStaticClassCreate.singletonStaticClass;
    }


    private static class SingletonStaticClassCreate{
        private static  SingletonStaticClass singletonStaticClass = new SingletonStaticClass();
    }
}
