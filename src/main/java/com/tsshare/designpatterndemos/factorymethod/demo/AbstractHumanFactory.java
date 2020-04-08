package com.tsshare.designpatterndemos.factorymethod.demo;

/**
 * @author chenzhenfei
 * @title: AbstractHumanFactory
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/823:53
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
