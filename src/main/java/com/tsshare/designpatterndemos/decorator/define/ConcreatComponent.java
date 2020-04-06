package com.tsshare.designpatterndemos.decorator.define;

/**
 * @author guabei
 * @title: ConcreatComponent
 * @projectName design-pattern-demos
 * @description: 具体组件 ConcreteComponent是最核心、最原始、最基本的接口或抽象类的 实现，你要装饰的就是它。
 * @date 2020/4/621:20
 */
public class ConcreatComponent extends Component {
    @Override
    public void opertion() {
        System.out.println("do Something");
    }
}
