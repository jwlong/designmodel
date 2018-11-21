package com.topiea.designmodel.ObsererPattern;

import java.util.Observable;

/**
 * @Author: kent long
 * @Date: 2018/11/20 上午 10:59
 */
public class Teacher extends Observable {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        this.setChanged();
        this.notifyObservers();
    }
}
