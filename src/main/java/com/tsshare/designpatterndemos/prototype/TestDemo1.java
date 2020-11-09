package com.tsshare.designpatterndemos.prototype;

import java.io.IOException;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 深复制和浅复制的测试
 * @date : 2020-11-06 16:10
 */
public class TestDemo1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        TestObject object =new TestObject();
        object.setField1("1");
        object.setField2("2");
        Prototype1 prototype1 =new Prototype1();
        prototype1.setName("prototype");
        prototype1.setTestObject(object);

        Prototype1 prototype11 = prototype1.deepCopy();
        Prototype1 clone = (Prototype1)prototype1.clone();

        //浅复制
        System.out.println(clone.toString());
        System.out.println(clone.toString().equals(prototype1.toString()));
        //深复制
        System.out.println(prototype11.toString());
        System.out.println(prototype11.toString().equals(prototype1.toString()));
    }
}
