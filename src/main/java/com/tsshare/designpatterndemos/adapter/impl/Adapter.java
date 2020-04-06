package com.tsshare.designpatterndemos.adapter.impl;

import com.tsshare.designpatterndemos.adapter.Target;
import com.tsshare.designpatterndemos.adapter.Adaptee;

/**
 * @author guabei
 * @title: Adapter
 * @projectName design-pattern-demos
 * @description: 适配器 = 建立原角色与目标角色的关系的  基本是通过集成和实现的方式来建立关系
 * @date 2020/4/619:37
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("我是适配器，将原角色doSomething 转化为目标角色的request");
        super.doSomething();
    }
}
