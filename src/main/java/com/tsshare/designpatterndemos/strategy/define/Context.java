package com.tsshare.designpatterndemos.strategy.define;

/**
 * @author guabei
 * @title: Context
 * @projectName design-pattern-demos
 * @description: 封装角色类
 * @date 2020/4/622:25
 */
public class Context {
    private Strategy strategy;
    //抽象策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //封装后的策略方法
    public  void doSomething(){
        this.strategy.doSomething();
    }
}
