package com.tsshare.designpatterndemos.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: TODO
 * @date : 2020-11-09 14:27
 */
@Slf4j
public class Sourceimp2 implements  Sourceable {
    @Override
    public void method() {
      log.debug("实现者{}" ,this.toString());
    }
}
