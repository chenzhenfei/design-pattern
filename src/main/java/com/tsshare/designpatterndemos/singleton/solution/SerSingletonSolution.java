package com.tsshare.designpatterndemos.singleton.solution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 解决单例模式序列话被破坏得问题
 * 在被序列化的类中添加readResolve方法
 */
public class SerSingletonSolution implements Serializable {

    private static final long serialVersionUID = 1L;
    String name;

    private SerSingletonSolution() {
        System.out.println("Singleton is create");
        name = "SerSingleton";
    }

    private static SerSingletonSolution instance = new SerSingletonSolution();

    public static SerSingletonSolution getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    private Object readResolve() {
        return instance;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingletonSolution s1 = null;
        SerSingletonSolution s = SerSingletonSolution.getInstance();

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("SerSingleton.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } finally {
            oos.flush();
            oos.close();
            fos.close();
        }

        try {
            fis = new FileInputStream("SerSingleton.obj");
            ois = new ObjectInputStream(fis);
            s1 = (SerSingletonSolution) ois.readObject();
        } finally {
            ois.close();
            fis.close();
        }
        System.out.println(s == s1);
    }

}