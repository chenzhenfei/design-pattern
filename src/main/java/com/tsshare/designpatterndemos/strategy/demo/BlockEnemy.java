package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: BlockEnemy
 * @projectName design-pattern-demos
 * @description: 妙计3
 * @date 2020/4/622:05
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
