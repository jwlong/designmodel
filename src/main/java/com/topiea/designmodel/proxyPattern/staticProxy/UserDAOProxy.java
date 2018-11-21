package com.topiea.designmodel.proxyPattern.staticProxy;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 04:16
 * 用户代理对象,实现接口
 */
public class UserDAOProxy implements IUserDAO {
    private IUserDAO target;
    public UserDAOProxy(IUserDAO target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始做一些保存前的验证");
        target.save();
        System.out.println("做一些保存后的事情");
    }
}
