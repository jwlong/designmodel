package com.topiea.designmodel.proxyPattern.dynamicProxy;

import com.topiea.designmodel.proxyPattern.staticProxy.IUserDAO;
import com.topiea.designmodel.proxyPattern.staticProxy.UserDAO;
import org.junit.jupiter.api.Test;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 05:25
 */
public class JdkProxyTest {
    @Test
    public void test() {
        IUserDAO target = new UserDAO();
        // 这里生成的是真正目录对象
        System.out.println(target.getClass());
        ProxyFactory proxyFactory = new ProxyFactory(target);
        IUserDAO proxy = (IUserDAO) proxyFactory.getProxyInstance();
        // jdk代理对象
        System.out.println(proxy.getClass());
        System.out.println(proxy instanceof UserDAO); //false
        proxy.save(); // 就是不是真实的目标对象来调用 aop实现
    }
}
