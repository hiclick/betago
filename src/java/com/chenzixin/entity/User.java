package com.chenzixin.entity;

import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Created by christen on 2/3/2017.
 */
public class User {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User u = new User();
        u.setAge(36);
        u.setName("Christen");
        System.out.println(u);
    }
}
