package com.tsshare.designpatterndemos.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 外观选择器
 * @date : 2020-11-09 13:55
 */
@Slf4j
public class Computer {
    private Cpu cpu;
    private Memeory memeory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memeory = new Memeory();
        this.disk = new Disk();
    }

    public  void startup(){
        log.debug("电脑开机");
        cpu.startup();
        memeory.startup();
        disk.startup();
    }


    public  void shutdown(){
        log.debug("电脑关闭");
        cpu.shutdown();
        memeory.shutdown();
        disk.shutdown();
    }

}
