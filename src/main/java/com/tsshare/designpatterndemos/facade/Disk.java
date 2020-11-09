package com.tsshare.designpatterndemos.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: TODO
 * @date : 2020-11-09 13:59
 */
@Slf4j
public class Disk {
    public Disk() {
    }

    public void startup(){
        log.debug("Disk 启动");
    }

    public void shutdown(){
        log.debug("Disk 关闭");
    }
}
