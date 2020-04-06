package com.tsshare.designpatterndemos.iterator.demo;

/**
 * @author guabei
 * @title: IProject
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/622:42
 */
public interface IProject {
    //增加项目
     void add(String name,int num,int cost);
    // 从老板这里看到的就是项目信息
     String getProjectInfo();
    // 获得一个可以被遍历的对象
     IProjectIterator iterator();
}
