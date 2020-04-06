package com.tsshare.designpatterndemos.iterator.demo;

import java.util.ArrayList;

/**
 * @author guabei
 * @title: ProjectIterator
 * @projectName design-pattern-demos
 * @description: 迭代器接口实现
 * @date 2020/4/622:44
 */
public class ProjectIterator implements IProjectIterator {
    //所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        IProject iProject = this.projectList.get(this.currentItem);
        this.currentItem++;
        return iProject;
    }

    @Override
    public void remove() {
        //暂时没有使用到
    }
}
