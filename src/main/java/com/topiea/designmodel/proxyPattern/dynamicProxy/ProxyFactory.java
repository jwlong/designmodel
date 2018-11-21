package com.topiea.designmodel.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 05:15
 */
public class ProxyFactory {
    // 需要被维护的代理对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理在目标对象被调用前做的准备。。。。");
                        Object returnValue = method.invoke(target,args);
                        System.out.println("jdk代理在目标对象被调用后做事件。。。。");
                        return returnValue;
                    }
                });
    }

}
