package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: SortDecorator
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/621:03
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort(){ System.out.println("我是排名第38名..."); }
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
