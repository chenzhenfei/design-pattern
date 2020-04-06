package com.tsshare.designpatterndemos.decorator.define;

/**
 * @author guabei
 * @title: DecoratorB
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/621:28
 */
public class DecoratorB extends  Decorator {
    public DecoratorB(Component component) {
        super(component);
    }
    private void decorateSomethingB(){
        System.out.println("装饰B");
    }
    @Override
    public void opertion() {
        super.opertion();
        this.decorateSomethingB();
    }
}
