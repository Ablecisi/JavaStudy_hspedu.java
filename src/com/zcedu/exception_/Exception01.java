package com.zcedu.exception_;

import java.util.Scanner;

/**
 * @author 周辰
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        try {
            sum = scan.nextInt();
        } catch (Exception e) {
            System.out.println("输入错误");
        } finally {
            System.out.println("sum = " + sum);
        }


    }
}
