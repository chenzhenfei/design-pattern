package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: Decorator
 * @projectName design-pattern-demos
 * @description: 装饰器类
 * @date 2020/4/620:25
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    @Override
    public void report() {
        this.sr.report();
    }

    //看完还是要签名的
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
