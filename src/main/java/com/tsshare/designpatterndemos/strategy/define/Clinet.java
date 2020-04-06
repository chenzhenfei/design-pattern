package com.tsshare.designpatterndemos.strategy.define;

/**
 * @author guabei
 * @title: Clinet
 * @projectName design-pattern-demos
 * @description: 高层调用类
 * @date 2020/4/622:26
 */
public class Clinet {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        //声明上下文对象
        Context context = new Context(strategy);
        context.doSomething();
        strategy = new ConcreteStrategyB();

        context = new Context(strategy);
        //执行封装后的方法
        context.doSomething();
    }
}
