package com.tsshare.designpatterndemos.abstractfactory.define;

/**
 * @author chenzhenfei
 * @title: Creator
 * @projectName design-pattern-demos
 * @description: 创建工厂1
 * @date 2020/4/90:21
 */
public class Creator1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
