package com.topiea.designmodel.ObsererPattern;

import org.junit.jupiter.api.Test;

/**
 * @Author: kent long
 * @Date: 2018/11/20 下午 12:01
 */
public class PatternTest {
    @Test
    public void test1() {
        Teacher t = new Teacher();
        for (int i = 1; i< 10; i++) {
            Student student = new Student("name"+i);
            // 老师添加被观察者学生
            t.addObserver(student);
        }
        t.setPhone("119");
        System.out.println("===========华丽的分割线=============");
        t.setPhone("113");
    }
}
