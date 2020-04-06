package com.tsshare.designpatterndemos.strategy.demo;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 場景
 * @date 2020/4/622:09
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context =new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n");
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context =new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n");
        System.out.println("---孙权的小兵追来了，咋办？拆第三个-- -");
        context =new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n\n\n");
    }
}
