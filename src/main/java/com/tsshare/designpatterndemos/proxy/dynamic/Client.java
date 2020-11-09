package com.tsshare.designpatterndemos.proxy.dynamic;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenzhenfei
 * @title: Client
 * @projectName design-pattern-demos
 * @description: 动态代理
 * @date 2020/11/921:16
 */
public class Client {
    public static void main(String[] args) {
        Source zhangsan = new SourceImp();
        InvocationHandler stuHandler = new SourceInvocationHandler(zhangsan);
        //加入下面代码以输出类到文件
        Source stuProxy = (Source) Proxy.newProxyInstance(Source.class.getClassLoader(), new Class<?>[]{Source.class}, stuHandler);
        stuProxy.method();
        stuProxy.method1();

    }
}
