package com.tsshare.designpatterndemos.abstractfactory.demo;

/**
 * @author chenzhenfei
 * @title: FemaleYellowHuman
 * @projectName design-pattern-demos
 * @description: product 实现
 * @date 2020/4/823:28
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
