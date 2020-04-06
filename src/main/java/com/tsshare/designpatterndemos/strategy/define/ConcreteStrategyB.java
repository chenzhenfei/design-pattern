package com.tsshare.designpatterndemos.strategy.define;

/**
 * @author guabei
 * @title: ConcreteStrategyA
 * @projectName design-pattern-demos
 * @description: 具体策略B 实现策略抽象
 * @date 2020/4/622:21
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略B的运算法则");
    }
}
