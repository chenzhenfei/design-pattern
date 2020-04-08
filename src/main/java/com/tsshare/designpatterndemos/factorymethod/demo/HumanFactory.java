package com.tsshare.designpatterndemos.factorymethod.demo;


/**
 * @author chenzhenfei
 * @title: HumanFactory
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/821:53
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        //产生一个人种
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
