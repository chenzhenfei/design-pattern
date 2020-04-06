package com.tsshare.designpatterndemos.iterator.demo;

import java.util.ArrayList;

/**
 * @author guabei
 * @title: Project
 * @projectName design-pattern-demos
 * @description: 迭代器容器
 * @date 2020/4/622:47
 */
public class Project implements IProject {
    //定义一个项目列表，说有的项目都放在这里
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private String name;
    private int num;
    private int cost;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        //获得项目的名称
        info = info + "项目名称是：" + this.name;
        //获得项目人数
        info = info + "\t项目人数: " + this.num;
        //项目费用
        info = info + "\t 项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
