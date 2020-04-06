package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: IStrategy
 * @projectName design-pattern-demos
 * @description: 公用的策略接口
 * @date 2020/4/622:03
 */
public interface IStrategy {
    //每个锦囊妙计都是一个可执行的算法
    void operate();
}
