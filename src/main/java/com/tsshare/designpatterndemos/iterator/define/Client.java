package com.tsshare.designpatterndemos.iterator.define;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/623:21
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate =new ConcreteAggregate();
        aggregate.add("测试1");
        aggregate.add("测试2");
        aggregate.add("测试3");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
