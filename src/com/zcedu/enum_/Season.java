package com.zcedu.enum_;

/**
 * @author 周辰
 * @version 1.0
 */
public class Season {
    private String name;
    private String description;

    // 枚举常量的名称是常量字面量，而不是变量名
    // 枚举常量名称是唯一的，因此可以作为标识符使用
    // 枚举常量名称是大小写敏感的
    // 枚举常量名称是常量，因此不能被修改
    // 枚举常量名称是编译时常量，因此不能是动态值
    // 枚举常量名称是静态的，因此不能是实例变量名
    // 枚举常量名称是公有的，因此不能是局部变量名
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        // 返回枚举常量的名称
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  "Season{" +
                "'" + name + '\'' +
                ", '" + description + '\'' +
                '}';
    }
}
//利用枚举关键字

enum Season2{
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");

    private String name;
    private String description;

    Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        // 返回枚举常量的名称
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  "Season2{" +
                "'" + name + '\'' +
                ", '" + description + '\'' +
                '}';
    }
}