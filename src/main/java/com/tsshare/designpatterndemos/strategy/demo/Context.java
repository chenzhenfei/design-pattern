package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: Context
 * @projectName design-pattern-demos
 * @description: 锦囊（装妙计使用的）==通过构造函数把策略传递进来，然后用operate()方法来执行相关的 策略方法
 * @date 2020/4/622:07
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy iStrategy) {
        this.strategy = iStrategy;
    }

    //使用计谋了，看我出招了
    public void operate() {
        this.strategy.operate();
    }
}
