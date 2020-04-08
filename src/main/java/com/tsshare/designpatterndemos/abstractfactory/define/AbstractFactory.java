package com.tsshare.designpatterndemos.abstractfactory.define;

/**
 * @author chenzhenfei
 * @title: AbstractFactory
 * @projectName design-pattern-demos
 * @description: 抽象工厂
 * @date 2020/4/90:19
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
