package com.zcedu.set_.hash_.improve;

import java.util.HashSet;
import java.util.Objects;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.set_.hash_.improve
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/7
 * 星期六
 * 0:48
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Employee> list = new HashSet<>();
        list.add(new Employee("jack", 20000, "2003","10","10"));
        list.add(new Employee("jac", 2000, "2002","10","10"));
        list.add(new Employee("ja", 200, "2001","10","10"));
        list.add(new Employee("ja", 200, "2001","10","10"));
        System.out.println(list);
    }
}
