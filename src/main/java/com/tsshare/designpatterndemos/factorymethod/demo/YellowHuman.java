package com.tsshare.designpatterndemos.factorymethod.demo;

/**
 * @author chenzhenfei
 * @title: YellowHuman
 * @projectName design-pattern-demos
 * @description: product 2
 * @date 2020/4/821:15
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
