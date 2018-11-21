package com.topiea.designmodel.proxyPattern.staticProxy;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 04:14
 * 目标对象
 * 目录对象需要实现接口
 */
public class UserDAO implements IUserDAO{

    @Override
    public void save() {
        System.out.println("保存用户数据...");
    }
}
