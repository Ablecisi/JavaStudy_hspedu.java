
package com.zcedu.test;

import java.util.Scanner;

public class TestJF {
    public TestJF() {
    }

    public static void JF() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = JiaFa(x, y);
        System.out.println(z);
        scan.close();
    }

    public static int JiaFa(int x, int y) {
        return x + y;
    }
}
