package com.zcedu.system_;
import java.util.Arrays;

public class SystemMethode {
    public static void main(String[] args) {
        //arraycopySys();
        currentTimeSys();
    }
    public static void arraycopySys(){
        //System.arraycopy()方法的使用
        String[] arr = new String[3];//{0,0,0}
        String[] arr1 = {"1", "2", "3"};
        System.arraycopy(arr1, 0, arr, 0, 3);
        System.out.print(Arrays.toString(arr));
    }
    public static void currentTimeSys(){
        System.out.println(System.currentTimeMillis());
    }
}
