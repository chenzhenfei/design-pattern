package com.tsshare.designpatterndemos.factorymethod.define;

/**
 * @author guabei
 * @title: ConcreteCreator
 * @projectName design-pattern-demos
 * @description: 具体的实现工厂 继承抽象工厂
 * @date 2020/4/70:00
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
