package com.zcedu.list_;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.list_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/5
 * 星期四
 * 13:25
 */
public class ListExercise {
    public static void main(String[] args) {
        List<Object> booklist = new ArrayList<>();//建立一个数组列表并添加数据
        booklist.add(new Book("红楼梦", "曹雪芹", 100));
        booklist.add(new Book("西游记", "吴承恩", 10));
        booklist.add(new Book("水浒传", "施耐庵", 19));
        booklist.add(new Book("三国", "罗贯中", 80));
        booklist.add(new Book("西游记", "吴承恩", 10));
        for(Object book : booklist){
            System.out.println(book);
        }
        System.out.println("====排序后====");
        //冒泡排序
        sortBookList(booklist);
        for(Object book : booklist){
            System.out.println(book);
        }
    }

    public static void sortBookList(List<Object> booklist){//对列表排序的方法
        //获取列表长度作为遍历的次数
        int listsize = booklist.size();
        //利用冒泡排序进行排序,两层for循环:
        //第一层为遍历列表的长度,
        //第二层为按规则交换相邻下标的数据
        for (int i = 0; i < listsize - 1; i++) {
            for (int j = 0; j < listsize - 1 - i; j++) {
                Book book1 = (Book) booklist.get(j);
                Book book2 = (Book) booklist.get(j + 1);
                if (book2.getPrice() < book1.getPrice()) {
                    booklist.set(j, book2);
                    booklist.set(j + 1, book1);
                }
            }
        }
    }
}
class Book{//创立Book类
    private String name;
    private String author;
    private final int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "\n名称：" + name + "\t" +
                "作者：" + author + "\t"+
                "价格：" + price;
    }
}
