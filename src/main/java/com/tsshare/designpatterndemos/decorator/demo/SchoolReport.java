package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: SchoolReport
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/620:19
 */
public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
