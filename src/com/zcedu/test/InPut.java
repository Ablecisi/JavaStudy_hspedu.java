
package com.zcedu.test;

import java.util.Scanner;

public class InPut {
    public InPut() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = scan.nextLine();
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println("请输入薪水");
        float salary = scan.nextFloat();
        System.out.println("人的信息如下：");
        System.out.println("名字:" + name + "\n年龄:" + age + "\n薪水:" + salary);
        System.out.printf("薪水:%.0f", salary);
    }
}
