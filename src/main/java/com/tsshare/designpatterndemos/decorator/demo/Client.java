package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/621:08
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("张三");
    }
}
