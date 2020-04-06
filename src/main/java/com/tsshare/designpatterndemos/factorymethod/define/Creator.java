package com.tsshare.designpatterndemos.factorymethod.define;

/**
 * @author guabei
 * @title: Creator
 * @projectName design-pattern-demos
 * @description: 抽象工厂
 * @date 2020/4/70:00
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
