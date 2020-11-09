package com.tsshare.designpatterndemos.decorator.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: TODO
 * @date : 2020-11-09 11:00
 */
@Slf4j
public class IceTea implements Tea {
    private Tea tea;

    public IceTea(Tea tea) {
        super();
        this.tea = tea;
    }

    @Override
    public void make() {
        tea.make();
        log.debug("加冰：{}",this.toString());
    }
}
