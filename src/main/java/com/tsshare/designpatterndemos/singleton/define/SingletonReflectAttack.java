package com.tsshare.designpatterndemos.singleton.define;

import org.springframework.expression.spel.ast.Elvis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  反射是如何破坏单例模式的，单例模式的目标是，任何时候该类都只有唯一的一个对象
 */
public class SingletonReflectAttack {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<?> classType = Singleton.class;

        Constructor<?> c = classType.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton e1 = (Singleton) c.newInstance();
        Singleton e2 = Singleton.getInstance();
        System.out.println(e1 == e2);
    }

}