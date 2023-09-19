package com.zcedu.collection_;
import java.util.*;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.collection
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/2
 */
@SuppressWarnings({"all"})
public class CollectionMethod {
    public static void main(String[] args) {
        // 创建一个集合对象
        List<String> list = new ArrayList<>();
        list.add(0, "Hello");
        list.add(1, "jack");
        //list.set(1,"\n");
        /*System.out.println(list);
        System.out.println();
        System.out.println();
        System.out.println("list="+list.get(1));
        System.out.println(list.hashCode());*/
        Collection<Object> coll = new ArrayList<>(list);
        Iterator<Object> iterator = coll.iterator();
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()){

            System.out.print(iterator.next()+" ");
            coll.remove("Hello");
        }
        System.out.println(coll);
    }
}
