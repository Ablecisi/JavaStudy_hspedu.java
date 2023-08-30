package com.zcedu.homework;

public class homework01 {
    //1.编程实现如下功能
    //某人有100,000元，每经过一次路口，需要交费，规则如下:
    //1)当现金> 50000时,每次交5%
    //2)当现金< = 50000时每次交1000
    //编程计算该人可以经过多少次路口，
    // 要求:使用while break方式完成

    //主函数main开始
    public static void main(String[] args) {
        int fee = 100000, i = 0;
        while(fee > 1000) {
            while (fee > 50000) {
                fee -= fee * 0.05;
                i++;
            }
            fee-=1000;
            i++;
        }
        System.out.println(i);
    }//主函数结束
}
