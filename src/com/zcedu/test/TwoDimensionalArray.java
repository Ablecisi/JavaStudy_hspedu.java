
package com.zcedu.test;

public class TwoDimensionalArray {
    public TwoDimensionalArray() {
    }

    public static void YangHui() {
        int[][] arr = new int[10][];
        System.out.println("杨辉三角形:");

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = new int[i + 1];

            for(int j = 0; j < arr[i].length; ++j) {
                if (j == 0) {
                    arr[i][j] = 1;
                    System.out.print("          " + arr[i][j] + " ");
                } else if (j == arr[i].length - 1) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }

    }

    public static void RandomArray() {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (int)Math.round(Math.random() * 100.0 + 1.0);
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void BubbleSort(int[] args) {
        boolean condition = true;

        for(int j = 0; j < args.length - 1; ++j) {
            for(int i = 0; i < args.length - 1; ++i) {
                if (args[i] > args[i + 1]) {
                    int temp = args[i + 1];
                    args[i + 1] = args[i];
                    args[i] = temp;
                    condition = false;
                }
            }

            if (condition) {
                return;
            }
        }

    }

    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = new int[3][];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = new int[i + 1];

            for(int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = i + 1;
                sum += arr[i][j];
            }
        }

        char[] arr1 = new char[]{'a', 'z', 'b', 'c'};
        arr1[2] = 'h';
        char[] var5 = arr1;
        int var6 = arr1.length;

        int var10000;
        int var7;
        for(var7 = 0; var7 < var6; ++var7) {
            var10000 = var5[var7];
        }

        int[] arr3 = new int[]{13, 2, 3, 4, 65, 23, 9};
        BubbleSort(arr3);
        int[] var12 = arr3;
        var7 = arr3.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            var10000 = var12[var8];
        }

    }
}
