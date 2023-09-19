package com.zcedu.string_;
import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        if (str.isEmpty() || str.equals(" ")) {
            str = "abcdefg";
        }
        System.out.println("你的字符为：" + str);
        System.out.print("请输入要反转的起始位置: ");
        int start = scanner.nextInt();
        System.out.print("请输入要反转的结束位置: ");
        int end = scanner.nextInt();
        System.out.println(reverse(str,start,end));
    }
    //定义一个方法reverse，接收字符串、起始位置和结束位置作为参数
    public static String reverse(String str,int start, int end){
        //创建一个字符串数组，长度为字符串的长度
        String[] st = new String[str.length()];
        //定义两个变量s和e分别表示起始位置和结束位置
        int s ;
        int e ;
        //定义一个变量count，表示需要反转的字符数量
        int count = (Math.abs(end - start))/2 + 1;
        //定义一个变量m，用于交换字符串数组中的两个字符
        String m;
        try {
            //根据起始位置和结束位置的值判断是否需要交换起始位置和结束位置
            if (end - start >= 0) {
                s = start - 1;
                e = end - 1;
            } else {
                s = end - 1;
                e = start - 1;
            }
            //将字符串中的每个字符添加到字符串数组中
            for (int i = 0; i < str.length(); i++) {
                st[i] = String.valueOf(str.charAt(i));
            }
            //根据需要反转的字符数量进行循环，交换字符串数组中的两个字符
            for (int j = 0; j < count; j++, s++, e--) {
                m = st[s];
                st[s] = st[e];
                st[e] = m;
            }
            //将字符串数组转换为字符串并返回
            return Arrays.toString(st);
        }catch (Exception ex){
            //如果发生异常，打印异常信息
            System.out.println(ex.getMessage());
        }
        //返回空字符串
        return "";
    }
}
