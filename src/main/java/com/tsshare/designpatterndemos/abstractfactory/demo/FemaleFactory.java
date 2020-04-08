package com.tsshare.designpatterndemos.abstractfactory.demo;

/**
 * @author chenzhenfei
 * @title: FemaleFactory
 * @projectName design-pattern-demos
 * @description: 女性工厂
 * @date 2020/4/823:38
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FeMaleWhiteHuman();
    }
}
