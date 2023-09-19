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
    public static String reverse(String str,int start, int end){
        String[] st = new String[str.length()];
        int s ;
        int e ;
        int count = (Math.abs(end - start))/2 + 1;
        String m;
        try {
            if (end - start >= 0) {
                s = start - 1;
                e = end - 1;
            } else {
                s = end - 1;
                e = start - 1;
            }
            for (int i = 0; i < str.length(); i++) {
                st[i] = String.valueOf(str.charAt(i));
            }
            for (int j = 0; j < count; j++, s++, e--) {
                m = st[s];
                st[s] = st[e];
                st[e] = m;
            }
            return Arrays.toString(st);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return "";
    }
}
