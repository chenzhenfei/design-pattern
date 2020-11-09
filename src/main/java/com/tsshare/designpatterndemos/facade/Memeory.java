package com.tsshare.designpatterndemos.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 内存
 * @date : 2020-11-09 13:57
 */
@Slf4j
public class Memeory {

    public Memeory() {
    }

    public void startup(){
        log.debug("Memeory 启动");
    }

    public void shutdown(){
        log.debug("Memeory 关闭");
    }
}
