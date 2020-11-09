package com.tsshare.designpatterndemos.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 源接口的实现类
 * @date : 2020-11-09 10:35
 */
@Slf4j
public class SourceImpl implements Source{

    @Override
    public void doRequest() {
      log.debug("我是源类的实现:{}",this.toString());
    }
}
