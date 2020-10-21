package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: SingletonTest2
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2121:36
 */
public class SingletonTest2 {
    private static SingletonTest2  singletonTest2 =new SingletonTest2();
    private SingletonTest2(){
    }

    public static SingletonTest2 getInstance(){
      return singletonTest2;
    }

}
