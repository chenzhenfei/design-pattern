package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: FouthGradeSchoolReport
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/620:20
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自 然 63");
        System.out.println(" .......");
        System.out.println(" 家长签 名： ");
    }
    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
