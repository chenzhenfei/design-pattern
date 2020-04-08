package com.tsshare.designpatterndemos.abstractfactory.demo;


/**
 * @author chenzhenfei
 * @title: AbstractWhiteHuman
 * @projectName design-pattern-demos
 * @description: product 分类 抽象
 * @date 2020/4/823:25
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
