package com.tsshare.designpatterndemos.factorymethod.demo;

/**
 * @author chenzhenfei
 * @title: BlackHuman
 * @projectName design-pattern-demos
 * @description: 产品的实现类
 * @date 2020/4/821:14
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
