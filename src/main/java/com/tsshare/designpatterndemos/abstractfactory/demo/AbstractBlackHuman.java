package com.tsshare.designpatterndemos.abstractfactory.demo;


/**
 * @author chenzhenfei
 * @title: AbstractWhiteHuman
 * @projectName design-pattern-demos
 * @description: product 分类 抽象
 * @date 2020/4/823:25
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
