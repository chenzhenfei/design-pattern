package com.tsshare.designpatterndemos.taipingyang;

/**
 * @author chenzhenfei
 * @title: TestClassLoad
 * @projectName design-pattern-demos
 * @description: AXYZ
 * @date 2020/10/220:21
 */
public class TestClassLoad {
    public static void main(String[] args) {
        ChildClass c =new ChildClass();
        ChildClass.statMethod();
        c.method();
    }
}
class ParentClass{
    public ParentClass() {
        System.out.println("A");
    }
    public static void statMethod(){
        System.out.println("B");
    }
    public void method(){
        System.out.println("C");
    }
}
class ChildClass extends ParentClass{
    public ChildClass() {
        System.out.println("X");
    }
    public static void statMethod(){
        System.out.println("Y");
    }
    @Override
    public void method(){
        System.out.println("Z");
    }
}