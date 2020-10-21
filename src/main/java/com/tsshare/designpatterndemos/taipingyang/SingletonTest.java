package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: SingletonTest
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2121:32
 */
public class SingletonTest {
    private static SingletonTest singletonTest =null;
    private  SingletonTest(){
    }
    public static SingletonTest getInstance(){
        if(singletonTest==null){
            return  new SingletonTest();
        }else{
            return singletonTest;
        }
        
    }
}
