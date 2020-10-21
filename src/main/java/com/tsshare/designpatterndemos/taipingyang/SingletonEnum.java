package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: SingletonEnum
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2121:40
 */
public enum SingletonEnum {
    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("The Test!");
    }
}
