package com.zcedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
