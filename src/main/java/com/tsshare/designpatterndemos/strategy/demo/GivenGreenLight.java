package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: GivenGreenLight
 * @projectName design-pattern-demos
 * @description: 妙计2
 * @date 2020/4/622:04
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
