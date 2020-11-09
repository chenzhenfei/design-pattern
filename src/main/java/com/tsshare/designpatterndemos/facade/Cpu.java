package com.tsshare.designpatterndemos.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: cpu
 * @date : 2020-11-09 13:56
 */
@Slf4j
public class Cpu {

    public Cpu() {
    }

    public  void startup(){
      log.debug("CPU 启动");
    }


    public  void shutdown(){
        log.debug("CPU 关闭");
    }
}
