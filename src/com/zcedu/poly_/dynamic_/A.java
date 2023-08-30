package com.zcedu.poly_.dynamic_;

public class A {
    public int i = 10;

    public int sum(){
        System.out.println("A sum");
        return getI() + 10;
    }
    public int sum1(){
        System.out.println("A sum1");
        return i + 10;
    }
    public int getI(){
        System.out.println("A getl");
        return i;
    }
}
