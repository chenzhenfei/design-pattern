package com.tsshare.designpatterndemos.abstractfactory.demo;

/**
 * @author chenzhenfei
 * @title: HumanFactory
 * @projectName design-pattern-demos
 * @description: human 工厂
 * @date 2020/4/823:35
 */
public interface HumanFactory {
    Human createYellowHuman();
    Human createBlackHuman();
    Human createWhiteHuman();
}
