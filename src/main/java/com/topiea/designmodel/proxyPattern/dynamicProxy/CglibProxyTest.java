package com.topiea.designmodel.proxyPattern.dynamicProxy;

import org.junit.jupiter.api.Test;

/**
 * @Author: kent long
 * @Date: 2018/11/21 下午 04:47
 */
public class CglibProxyTest {
    @Test
    public void test() {
        CglibTargetObj targetObj = new CglibTargetObj();
        System.out.println(targetObj.getClass());
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(targetObj);
        CglibTargetObj obj =(CglibTargetObj) cglibProxyFactory.getProxyInstance();
        System.out.println(obj.getClass());
        obj.save();
    }
}
