package com.learn.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class User  implements Serializable {
    private  String name;
    private  String password;
    private  String price;
    private  List<Wen> list;
    private  Map<String,Wen> map;
    private  Date date;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Wen> getList() {
        return list;
    }

    public void setList(List<Wen> list) {
        this.list = list;
    }

    public Map<String, Wen> getMap() {
        return map;
    }

    public void setMap(Map<String, Wen> map) {
        this.map = map;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", price='" + price + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", date=" + date +
                '}';
    }
}
