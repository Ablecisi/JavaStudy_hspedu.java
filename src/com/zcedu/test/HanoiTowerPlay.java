
package com.zcedu.test;

public class HanoiTowerPlay {
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("" + a + "->" + c);
        } else {
            this.move(num - 1, a, c, b);
            System.out.println("" + a + "->" + c);
            this.move(num - 1, b, a, c);
        }

    }
}
