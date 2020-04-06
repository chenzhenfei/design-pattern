package com.tsshare.designpatterndemos.adapter;

import java.util.Map;

/**
 * @author guabei
 * @title: IOuterUser
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/4/612:02
 */
public interface IOuterUser {
    //基本信息，比如名称、性别、手机号码等
    Map getUserBaseInfo();

    // 工作区域信息
    Map getUserOfficeInfo();

    //用户的家庭信息
    Map getUserHomeInfo();
}
