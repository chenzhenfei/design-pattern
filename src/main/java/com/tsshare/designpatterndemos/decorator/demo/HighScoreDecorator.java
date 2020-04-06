package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: HighScoreDecorator
 * @projectName design-pattern-demos
 * @description: 高分装饰器 集成装饰器
 * @date 2020/4/620:28
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然 是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
