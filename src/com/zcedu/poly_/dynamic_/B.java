package com.zcedu.poly_.dynamic_;

public class B extends A {
    public int i = 20;

    public int sum(){
        System.out.println("B sum");
        return i + 20;
    }
    public int getI(){
        System.out.println("B getl");
        return i;
    }
    public int sum1(){
        System.out.println("B sum1");
        return i + 10;
    }
}
