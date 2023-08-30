
package com.zcedu.test;

import java.util.Scanner;

public class Switch {
    public Switch() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        char y = x.charAt(0);
        switch (y) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                y = (char)(y - 32);
                System.out.println(y);
                break;
            default:
                System.out.println("other");
        }

        int score = scan.nextInt();
        if (score >= 0 && score <= 100) {
            switch (score / 60) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
            }
        } else {
            System.out.println("输入出错");
        }

        int mouth = scan.nextInt();
        switch (mouth) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入错误");
        }

        scan.close();
    }
}
