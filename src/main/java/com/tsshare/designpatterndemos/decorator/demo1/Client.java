package com.tsshare.designpatterndemos.decorator.demo1;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 装饰演示 - 奶茶由 开水 -> 红茶 -> 加冰 ->加奶
 * @date : 2020-11-09 11:42
 */
public class Client {
    public static void main(String[] args) {
        Tea tea =new TeaImp();
        RedTea redTea =new RedTea(tea);
        IceTea iceTea =new IceTea(redTea);
        MilkTea milkTea =new MilkTea(iceTea);
        milkTea.make();
    }
}
