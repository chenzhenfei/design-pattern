package com.tsshare.designpatterndemos.singleton.define;

/**
 * 枚举方式创建单例模式
 */
public enum SingletonClass {
    INSTANCE;

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
}

class TestMain {

    public static void main(String[] args) {

        SingletonClass one = SingletonClass.INSTANCE;
        SingletonClass two = SingletonClass.INSTANCE;


        one.test();
        one.setName("I am a SingletonClass Instance");
        System.out.println(one.getName());

        if (one == two) {

            System.out.println("There are same");
        }
    }
}