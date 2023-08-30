
package com.zcedu.test;

public class Constructor {
    public Constructor() {
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ablecisi", 19);
        System.out.println("zc的名字为：" + p1.name + "\n年龄：" + p1.age);
    }
}
