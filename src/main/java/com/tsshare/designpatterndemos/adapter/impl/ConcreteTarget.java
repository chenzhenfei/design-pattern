package com.tsshare.designpatterndemos.adapter.impl;

import com.tsshare.designpatterndemos.adapter.Target;

/**
 * @author guabei
 * @title: ConcreteTarget
 * @projectName design-pattern-demos
 * @description: 目标角色实现类
 * @date 2020/4/619:31
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
