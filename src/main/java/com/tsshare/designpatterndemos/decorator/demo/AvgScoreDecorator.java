package com.tsshare.designpatterndemos.decorator.demo;

/**
 * @author guabei
 * @title: AvgScoreDecorator
 * @projectName design-pattern-demos
 * @description: 平均分装饰器
 * @date 2020/4/621:11
 */
public class AvgScoreDecorator extends Decorator {
    public AvgScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportAvg(){
        System.out.println("这次平均分60");
    }
    @Override
    public void report() {
        this.reportAvg();
        super.report();
    }
}
