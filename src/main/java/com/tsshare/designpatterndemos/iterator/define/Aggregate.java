package com.tsshare.designpatterndemos.iterator.define;

/**
 * @author guabei
 * @title: Aggregate
 * @projectName design-pattern-demos
 * @description: 抽象容器
 * @date 2020/4/623:17
 */
public interface Aggregate {
    void add(Object object);

    void remove(Object object);

    //由迭代器来遍历所有的元素
    Iterator iterator();
}
