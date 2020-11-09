package com.tsshare.designpatterndemos.prototype;



import java.io.*;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 原型模式：通过类的复制来实现类的创建
 *               存在深浅复制问题  简单类型直接复制，引用类之指向原来对象
 * @date : 2020-11-06 15:27
 */
public class Prototype1 implements Cloneable,Serializable{

    /**
     * 测试浅复制  简单类型
      */
    private String name;

    /**
     * 测试深复制  引用类型对象
      */
    private TestObject testObject;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestObject getTestObject() {
        return testObject;
    }

    public void setTestObject(TestObject testObject) {
        this.testObject = testObject;
    }

    // 浅复制方式
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype1 clone =(Prototype1) super.clone();
        return clone;
    }

    //深复制方式, 通过流
    public Prototype1 deepCopy() throws IOException, ClassNotFoundException {
        // 写入当前对象的流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 读入流的对象并实例化
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream =new ObjectInputStream(byteArrayInputStream);

        return (Prototype1)objectInputStream.readObject();
    }

    @Override
    public String toString() {
        return "Prototype1{" +
                "name='" + name + '\'' +
                ", testObject=" + testObject +
                '}';
    }
}
