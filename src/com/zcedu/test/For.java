
package com.zcedu.test;

public class For {
    public For() {
    }

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 100; ++i) {
            if (i % 9 == 0) {
                ++count;
                sum += i;
                System.out.println(i);
            }
        }

        System.out.printf("个数:%d\n总和:%d\n", count, sum);
        int firstnum = 0;

        for(int secondnum = 5; firstnum <= 5; --secondnum) {
            int sumnum = firstnum + secondnum;
            System.out.println("" + firstnum + " + " + secondnum + " = " + sumnum);
            ++firstnum;
        }

    }
}
