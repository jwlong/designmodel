package com.topiea.designmodel.proxyPattern.staticProxy;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 04:22
 * 静态代理测试类
 */
public class StaticProxyPatterTest {

    /**
     * 静态代理的优点
     * 可以做到不修改目录对象功能的前提下，完成对目录对象功能的扩展
     * 缺点：
     * 被代理的对象需要实现接口，若接口中增加方法 ，
     * 目标对象和代理对象都要维护
     */
    @Test
    public void test() {
        UserDAO userDAO = new UserDAO();
        UserDAOProxy proxy = new UserDAOProxy(userDAO);
        proxy.save();
    }

}
