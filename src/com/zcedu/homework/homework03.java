package com.zcedu.homework;

import java.util.Objects;
import java.util.Scanner;

public class homework03 {
    public static void main(String[] args){
        Find fd = new Find();
        Scanner scan = new Scanner(System.in);

        String[] arr = {"a","b","Hello World","hello world","c"};
        String input = scan.nextLine();

        if (!fd.find(input, arr).equals("-1")){
            System.out.println("查找的字符已找到为：" + input + "\n" + "在数组的第" + fd.find(input, arr) + "个元素");
        } else {
            System.out.println("未找到该字符");
        }
    }
}

class Find{

    public String find(String args, String[] arr){
        for (int i = 0; i < arr.length; i++){
            if (Objects.equals(args, arr[i])) {
                return String.valueOf(i + 1);
            }
        }
        return "-1";
    }
}
