package com.tsshare.designpatterndemos.iterator.demo;

/**
 * @author guabei
 * @title: Boss
 * @projectName design-pattern-demos
 * @description: 场景类
 * @date 2020/4/622:47
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 10000, 1000000000);
        project.add("司空见惯项目", 100000, 1000000000);
        project.add("蜘蛛侠项目", 1000000, 1000000000);

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject next = (IProject) iterator.next();
            System.out.println(next.getProjectInfo());
        }
    }
}
