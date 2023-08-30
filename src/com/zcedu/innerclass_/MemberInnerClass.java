package com.zcedu.innerclass_;

public class MemberInnerClass {
    public static void main(String[] args) {

        //第一种方法，直接创建对象调用成员内部类
        Outer02.Inner01 inner01 = new Outer02().new Inner01();
        inner01.show();

        //第二种方法，若为static
        /*
        *则可以省略new,为Outer02.Inner01 inner01 = new Outer02.Inner01();
        *或new Outer02.Inner01().show();
        *或用类名调用成员内部类Outer02.Inner01 inner02 = Outer02.Inner01.show();
        */

        //第三种方法，用方法输出成员内部类
        Outer02 outer02 = new Outer02();
        outer02.InFor();

        //第四种方法，用对象输出成员内部类
        Outer02 oo = new Outer02();
        oo.aa.show();

    }
}

class Outer02 {
    private int a = 1;

    class Inner01{
        public void show() {
            System.out.println("show");
        }
    }

    public void InFor() {
        Inner01 inner = new Inner01();
        inner.show();
    }

    Inner01 aa = new Inner01();
}