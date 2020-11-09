package com.tsshare.designpatterndemos.bridge;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 抽象桥
 * @date : 2020-11-09 14:28
 */
public abstract class Bridge {
    private Sourceable sourceable;


    public void method(){
        this.sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
