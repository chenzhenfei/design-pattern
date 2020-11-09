package com.tsshare.designpatterndemos.decorator.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: TODO
 * @date : 2020-11-09 10:55
 */
@Slf4j
public class RedTea implements Tea {
    private Tea TeaImp;

    public RedTea(Tea teaImp) {
        super();
        TeaImp = teaImp;
    }

    @Override
    public void make() {
        this.TeaImp.make();
        log.debug("红茶：{}",this.toString());
    }
}
