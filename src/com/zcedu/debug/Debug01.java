package com.zcedu.debug;
import java.util.Arrays;

// 创建一个名为Debug01的类
public class Debug01 {
    // main方法用于运行代码
    public static void main(String[] args) {
        // 创建一个整数数组，包含1、10和-1
        int[] arr = {1, 10, -1};
        // 对数组进行排序
        Arrays.sort(arr);
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 打印数组中的值
            System.out.println(arr[i]);
        }
    }

}
