
package com.zcedu.test;

import java.util.Scanner;

class AA {
    AA() {
    }

    public static boolean OddEvenNumber(int args) {
        int remainder = args % 2;
        if (remainder == 0) {
            System.out.println("" + args + "��ż��");
            return true;
        } else {
            System.out.println("" + args + "������");
            return false;
        }
    }

    public static void Print() {
        Scanner scan = new Scanner(System.in);
        System.out.println("�У�");
        int args = scan.nextInt();
        System.out.println("�У�");
        int args1 = scan.nextInt();
        System.out.println("�ַ���");
        char args2 = scan.next().charAt(0);

        for(int i = 0; i < args; ++i) {
            for(int j = 0; j < args1; ++j) {
                System.out.print("" + args2 + " ");
            }

            System.out.println();
        }

        scan.close();
    }
}
