package com.tsshare.designpatterndemos.iterator.define;

import java.util.Vector;

/**
 * @author guabei
 * @title: ConCreateIteator
 * @projectName design-pattern-demos
 * @description: 具体迭代器
 * @date 2020/4/623:12
 */
public class ConCreateIteator implements Iterator {
    private Vector vector = new Vector(); //定义当前游标
    public int cursor = 0;

    public ConCreateIteator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        this.vector.remove(this.cursor);
    }
}
