package com.kdls.entity;

import java.io.IOException;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int add() throws IOException{
        if (age++==2) throw new IOException("e");
        return age++;
    }
}
