package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: BackDoor
 * @projectName design-pattern-demos
 * @description: 妙计1
 * @date 2020/4/622:04
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
