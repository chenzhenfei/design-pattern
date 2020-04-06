package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: SugarFouthGradeSchoolReport
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/620:23
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然 是80");
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        //先说最高成绩
        this.reportHighScore();
        // 然后老爸看成绩单
        super.report();
        //然后告诉老爸学习学校排名
        this.reportSort();
    }

    @Override
    public void sign(String name) {
        super.sign(name);
    }
}
