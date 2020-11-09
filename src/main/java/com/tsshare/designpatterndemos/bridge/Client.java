package com.tsshare.designpatterndemos.bridge;

/**
 * @author : zfchen
 * @version 10
 * @Description: 桥接
 * @date : 2020-11-09 14:37
 */
public class Client {

    public static void main(String[] args) {
        Bridge bridge = new Mybridge();
        Sourceable sou1 =new Sourceimp1();
        Sourceable sou2 =new Sourceimp2();
        bridge.setSourceable(sou1);
        bridge.method();
        bridge.setSourceable(sou2);
        bridge.method();
    }
}
