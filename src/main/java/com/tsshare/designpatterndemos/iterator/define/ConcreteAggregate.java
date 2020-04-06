package com.tsshare.designpatterndemos.iterator.define;

import java.util.Vector;

/**
 * @author guabei
 * @title: ConcreteAggregate
 * @projectName design-pattern-demos
 * @description: 具体容器实现
 * @date 2020/4/623:18
 */
public class ConcreteAggregate implements Aggregate {
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConCreateIteator(this.vector);
    }
}
