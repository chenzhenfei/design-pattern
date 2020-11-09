package com.tsshare.designpatterndemos.proxy;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 代理模式
 * @date : 2020-11-09 10:33
 */
public class StatisProxyDemo {

    public static void main(String[] args) {
        Source source =new SourceImpl();
        Source proxySource =new ProxySource(source);
        proxySource.doRequest();
    }
}
