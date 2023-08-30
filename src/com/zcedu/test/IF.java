
package com.zcedu.test;

import java.util.Scanner;

public class IF {
    public IF() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        if (y >= 1.0F && y <= 12.0F) {
            if (y >= 4.0F && y <= 10.0F) {
                if (x == 100.0F) {
                    System.out.println("信用极好");
                } else if (x > 80.0F && x <= 99.0F) {
                    System.out.println("信用优秀");
                } else if (x >= 60.0F && x <= 80.0F) {
                    System.out.println("信用一般");
                } else {
                    System.out.println("信用不及格或输入值不满足1-100");
                }

                scan.close();
            } else {
                x = 40.0F;
                y = 20.0F;
            }
        } else {
            System.out.println("输入有错");
        }

    }
}
