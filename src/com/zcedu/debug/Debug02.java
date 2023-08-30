package com.zcedu.debug;

public class Debug02 {
    public static void main(String[] args) {
        AA a = new AA("a", 10);
        int b = a.hashCode();
        System.out.println(b);
    }
}
