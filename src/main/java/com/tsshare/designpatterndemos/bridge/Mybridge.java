package com.tsshare.designpatterndemos.bridge;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: TODO
 * @date : 2020-11-09 14:30
 */
public class Mybridge extends Bridge {

    public Mybridge() {
    }

    @Override
    public void method() {
        getSourceable().method();
    }

}
