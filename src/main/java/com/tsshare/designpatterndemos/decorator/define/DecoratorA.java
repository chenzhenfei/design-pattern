package com.tsshare.designpatterndemos.decorator.define;

/**
 * @author guabei
 * @title: DecoratorA
 * @projectName design-pattern-demos
 * @description: 装饰器A 继承统一的装饰抽样类，在统一的装饰抽象上进行细化装饰
 * @date 2020/4/621:26
 */
public class DecoratorA extends Decorator{
    public DecoratorA(Component component) {
        super(component);
    }
    private void decorateSomethingA(){
        System.out.println("装饰A");
    }
    @Override
    public void opertion() {
        this.decorateSomethingA();
        super.opertion();
    }
}
