package com.topiea.designmodel.ObsererPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: kent long
 * @Date: 2018/11/20 上午 11:56
 * 实现Observer接口
 */
public class Student implements Observer {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        //被观察的对象
        Teacher teacher = (Teacher) o;
        System.out.println("学生："+name+",现在老师的手机号为:"+teacher.getPhone());
    }
}
