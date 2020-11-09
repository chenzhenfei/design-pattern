package com.tsshare.designpatterndemos.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chenzhenfei
 * @title: SourceImp
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/11/921:58
 */
@Slf4j
public class SourceImp implements Source{
    @Override
    public void method() {
            log.debug("原始对象{}","method()");
    }

    @Override
    public void method1() {
        log.debug("原始对象{}","method1()");
    }
}
