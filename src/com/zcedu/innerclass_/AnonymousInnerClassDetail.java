package com.zcedu.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.Hi();

        //将匿名内部类作为参数传递给方法
        Parameter(new IA(){
            @Override
            public void cry(){
                System.out.println("调用了匿名内部类的cry方法，来自于接口IA");
            }
        });

    }
    //静态方法，以接口为参数
    public static void Parameter(IA ia){
        ia.cry();
    }

}

class Outer01 {
    private int a = 99;//外部类的参数内部类可以访问
    //匿名内部类的参数访问
    public void Hi() {
        //匿名内部类
        new AA("jack") {
            private int b = 100;//内部类的属性外部类无法访问
            private int a = 110;//内部类的属性如果和外部类重名，会覆盖外部类的属性
            @Override
            public void printName() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(Outer01.this.a);//可以用外部类名.this.属性名用于区别
            }
        }.printName();
    }

}

