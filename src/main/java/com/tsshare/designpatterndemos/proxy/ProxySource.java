package com.tsshare.designpatterndemos.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 代理对象
 * @date : 2020-11-09 10:35
 */
@Slf4j
public class ProxySource implements Source {
    private  Source source;

    public ProxySource(Source source) {
        this.source = source;
    }

    @Override
    public void doRequest() {
        log.debug("代理类之前植入：{}",this.toString());
        source.doRequest();
        log.debug("代理执行结束");
    }
}
