package com.tsshare.designpatterndemos.decorator.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @Description: 原始被装饰的对象
 * @date : 2020-11-09 10:54
 */
@Slf4j
public class TeaImp implements  Tea {
    @Override
    public void make() {
      log.debug("我是一杯开水: {}",this.toString());
    }
}
