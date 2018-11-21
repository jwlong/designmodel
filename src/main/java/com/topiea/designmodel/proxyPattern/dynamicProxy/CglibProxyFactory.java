package com.topiea.designmodel.proxyPattern.dynamicProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: kent long
 * @Date: 2018/11/21 下午 04:34
 */
public class CglibProxyFactory implements MethodInterceptor {
    // 维护的目标对象
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //enhancer 增强工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass()); //设置目标对象为代理对象的父类
        enhancer.setCallback(this);//设置回调函数
        return enhancer.create(); // 创建子类对象
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //需要扩展的地方
        System.out.println("开始做保存之前的事....");
        Object returnObj = method.invoke(target,objects);
        System.out.println("结束保存之后做的事....");
        return returnObj;
    }

}
