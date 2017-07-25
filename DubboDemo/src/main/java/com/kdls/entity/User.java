package com.kdls.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class User implements Serializable{
    private String id;
    private String name;
    private Date bir;

    public User(String id, String name, Date bir) {
        this.id = id;
        this.name = name;
        this.bir = bir;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bir=" + bir +
                '}';
    }
}
