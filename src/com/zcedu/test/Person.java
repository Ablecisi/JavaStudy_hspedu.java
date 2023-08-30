
package com.zcedu.test;

class Person {
    String name;
    int age;

    public Person(String pName, int pAge) {
        System.out.println("构造器被调用");
        this.name = pName;
        this.age = pAge;
    }
}
