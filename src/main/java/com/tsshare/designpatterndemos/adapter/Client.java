package com.tsshare.designpatterndemos.adapter;

import com.tsshare.designpatterndemos.adapter.impl.Adapter;
import com.tsshare.designpatterndemos.adapter.impl.ConcreteTarget;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/619:40
 */
public class Client {

    public static void  main(String[] args) {
        System.out.println("我是适配器模式");
        //原有的业务逻辑
        System.out.println("原有业务逻辑");
        Target target = new ConcreteTarget();
        target.request();
        //现在增加了适配器角色后的业务逻辑
        System.out.println("现有业务逻辑");
        Target target2 = new Adapter();
        target2.request();
    }
}
