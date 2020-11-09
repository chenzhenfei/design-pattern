package com.tsshare.designpatterndemos.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SourceInvocationHandler implements InvocationHandler {
    private Source source;

    public SourceInvocationHandler(Source source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("代理执行"+method.getName()+"方法");
        Object invoke = method.invoke(source, objects);
        return invoke;
    }
}
