
package com.zcedu.test;

import java.util.Objects;
import java.util.Scanner;

public class ArrayAdd {
    public ArrayAdd() {
    }

    public static String LimitInputInt(String args) {
        Scanner scan = new Scanner(System.in);
        boolean arg = false;

        do {
            for(int i = 0; i < args.length(); ++i) {
                if (args.charAt(0) == '0') {
                    if (args.length() == 1) {
                        return "0";
                    }

                    args = args.substring(1);
                    return LimitInputInt(args);
                }

                if (args.charAt(i) < '0' || args.charAt(i) > '9') {
                    if (args.charAt(i) == ' ') {
                        if (i == 0) {
                            if (args.length() == 1) {
                                return "0";
                            }

                            args = args.substring(i + 1);
                            return LimitInputInt(args);
                        }

                        if (i == args.length() - 1) {
                            return LimitInputInt(args.substring(0, i));
                        }

                        String var10000 = args.substring(0, i);
                        return LimitInputInt(var10000 + args.substring(i + 1));
                    }

                    arg = true;
                    System.out.println("错误,请输入整数:");
                    args = scan.nextLine();
                    break;
                }

                arg = false;
            }
        } while(arg);

        return args;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入初始数组的长度:");
        String len = scan.nextLine();
        int[] arr = new int[Integer.parseInt(LimitInputInt(len))];
        System.out.println("请输入初始数组的值:");

        String exnums;
        for(int i0 = 0; i0 < arr.length; ++i0) {
            exnums = scan.nextLine();
            arr[i0] = Integer.parseInt(LimitInputInt(exnums));
        }

        System.out.println("请决定是否扩充:(输入yes或no)");

        String input;
        for(input = scan.nextLine(); !Objects.equals(input, "yes") && !Objects.equals(input, "no"); input = scan.nextLine()) {
            System.out.println("输入错误:(请输入yes或no)");
        }

        do {
            System.out.println("请输入要扩容的数量:");
            exnums = scan.nextLine();
            int exnum = Integer.parseInt(LimitInputInt(exnums));
            int[] arrnew = new int[arr.length + exnum];
            int lennew = arr.length + exnum;
            System.arraycopy(arr, 0, arrnew, 0, arr.length);
            System.out.println("请添加新的数据:\n(根据个数)");

            int i2;
            for(i2 = arr.length; i2 < lennew; ++i2) {
                String arrnews = scan.nextLine();
                arrnew[i2] = Integer.parseInt(LimitInputInt(arrnews));
            }

            arr = arrnew;
            System.out.println("新数组的数据为:");

            for(i2 = 0; i2 < lennew; ++i2) {
                System.out.print(arr[i2] + " ");
            }

            System.out.println("\n是否要继续扩充:");

            for(input = scan.nextLine(); !Objects.equals(input, "yes") && !Objects.equals(input, "no"); input = scan.nextLine()) {
                System.out.println("输入错误:(请输入yes或no)");
            }
        } while(Objects.equals(input, "yes"));

        System.out.println("==你退出了添加==");
        scan.close();
    }
}
