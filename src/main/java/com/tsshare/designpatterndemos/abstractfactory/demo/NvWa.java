package com.tsshare.designpatterndemos.abstractfactory.demo;

/**
 * @author chenzhenfei
 * @title: NvWa
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/823:45
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        Human blackHuman = maleHumanFactory.createBlackHuman();
        Human whiteHuman = maleHumanFactory.createWhiteHuman();
        Human yellowHuman = maleHumanFactory.createYellowHuman();
        blackHuman.getSex();
        blackHuman.talk();
        whiteHuman.getSex();
        whiteHuman.talk();
        yellowHuman.getSex();
        yellowHuman.talk();

        HumanFactory feMaleHumanFactory = new FemaleFactory();
        Human whiteHuman1 = feMaleHumanFactory.createWhiteHuman();
        Human yellowHuman1 = feMaleHumanFactory.createYellowHuman();
        Human blackHuman1 = feMaleHumanFactory.createBlackHuman();

        whiteHuman1.getSex();
        whiteHuman1.talk();
        yellowHuman1.getSex();
        yellowHuman1.talk();
        blackHuman1.getSex();
        blackHuman1.talk();


    }
}
