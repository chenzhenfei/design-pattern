package com.tsshare.designpatterndemos.factorymethod.demo;

/**
 * @author chenzhenfei
 * @title: WhiteHuman
 * @projectName design-pattern-demos
 * @description: product
 * @date 2020/4/821:16
 */
public class WhiteHuman implements  Human {
    @Override
    public void getColor() {
        System.out.println("白色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白色人说话");
    }
}
