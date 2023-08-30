
package com.zcedu.test;

public class Object {
    public Object() {
    }

    public static void Va(Cat args) {
        args.age = 2;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        Va(cat1);
        System.out.println(cat1.age);
        int x = 1;
        int y = 2;
        int z = Cat.Vb(1, 2);
        System.out.println(x < z ? x : y);
    }
}
