package com.zcedu.list_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.list_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/3
 * 星期二
 * 3:45
 */
public class List_ {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List<Object> list2 = new Vector<>();
        list.add("jack");
        list.add("rose");
        list2.add("jack");
        list2.add("abby");
        list.add(1, "jerry");
        list.addAll(1,list2);
        System.out.println(list);
        list.add(1, list2);
        System.out.println(list);
        System.out.println(list.indexOf(list2));
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = {};
        arr1 = Arrays.copyOf(arr1,10);
        System.arraycopy(arr,0,arr1,0,arr.length);

        System.out.println(Arrays.toString(arr1));

    }
}
