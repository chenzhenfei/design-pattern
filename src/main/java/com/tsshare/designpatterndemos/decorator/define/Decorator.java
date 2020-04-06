package com.tsshare.designpatterndemos.decorator.define;

/**
 * @author guabei
 * @title: Decorator
 * @projectName design-pattern-demos
 * @description: 装饰器
 * @date 2020/4/621:22
 */
public abstract class Decorator extends Component{
    private  Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void opertion() {
        this.component.opertion();
    }
}
