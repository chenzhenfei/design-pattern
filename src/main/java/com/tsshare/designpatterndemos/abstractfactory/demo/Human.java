package com.tsshare.designpatterndemos.abstractfactory.demo;

/**
 * @author chenzhenfei
 * @title: Human
 * @projectName design-pattern-demos
 * @description: product 抽象接口
 * @date 2020/4/821:09
 */
public interface Human {
    //每个人种的皮肤都有相应的颜色
    void getColor();
    //人类会说话
    void talk();
    //每个人都有性别
    void getSex();
}
