package com.tsshare.designpatterndemos.facade;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 外观模式场景
 * @date : 2020-11-09 14:02
 */
public class Client {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.startup();

        computer.shutdown();
    }
}
