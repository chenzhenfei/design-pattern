package com.tsshare.designpatterndemos.abstractfactory.define;

/**
 * @author chenzhenfei
 * @title: Creator
 * @projectName design-pattern-demos
 * @description: 创建工厂2
 * @date 2020/4/90:21
 */
public class Creator2 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
