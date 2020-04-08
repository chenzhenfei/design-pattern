package com.tsshare.designpatterndemos.abstractfactory.demo;

import com.tsshare.designpatterndemos.factorymethod.demo.YellowHuman;

/**
 * @author chenzhenfei
 * @title: FemaleYellowHuman
 * @projectName design-pattern-demos
 * @description: product 实现
 * @date 2020/4/823:28
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
