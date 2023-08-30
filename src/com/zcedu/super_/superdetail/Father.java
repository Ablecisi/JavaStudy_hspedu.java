package com.zcedu.super_.superdetail;

public class Father {
    private String name;
    private int age;

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void ShowInfo(){
        System.out.println("name=" + name + "age=" + age);
    }
}
