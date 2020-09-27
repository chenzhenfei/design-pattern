package com.tsshare.designpatterndemos.singleton.solution;

import java.io.*;

/**
 * 采用枚举方式创建得单例模式  是不会被序列话破坏   -- 推荐方式
 */
public enum SingletonClass implements Serializable {

    INSTANCE;
    private static final long serialVersionUID = 1L;

    private String name;

    public void test() {
        System.out.println("The Test!");
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonClass s1 = null;
        SingletonClass s = SingletonClass.INSTANCE;

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("SingletonClass.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } finally {
            oos.flush();
            oos.close();
            fos.close();
        }

        try {
            fis = new FileInputStream("SingletonClass.obj");
            ois = new ObjectInputStream(fis);
            s1 = (SingletonClass) ois.readObject();
        } finally {
            ois.close();
            fis.close();
        }
        System.out.println(s == s1);
    }
}