package com.zcedu.innerclass_;

public class InnerClassExercise {
    public static void main(String[] args) {
        // 创建CellPhone对象，利用匿名内部类作为参数
        new CellPhone(new Bell() {
            @Override
            public void ring() {
                System.out.println("小猪起床了！");
            }
        });
        new CellPhone(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了！");
            }
        });
    }
}
//创建一个打电话类
class CellPhone{
    //无参构造器
    public CellPhone() {
    }
    //利用构造器传入接口属性(参数)，直接调用接口中的方法(会在传进的参数中被重写)
    public CellPhone(Bell bell) {
        bell.ring();
    }
}
