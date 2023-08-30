package com.zcedu.annotation_;
import java.lang.annotation.*;

/**
 * import java.lang.annotation.Retention;* 元注解的作用就是负责注解其他注解。
 * Java5.0定义了4个标准的meta-annotation类型，它们被用来提供对其它annotation类型作说明。
 * Java5.0定义的元注解有以下几种：
 * 元注解是指注解的注解，Java中有：
 * <p>
 * ① @Retention: 定义注解的保留策略:
 * <ul>
 *     <li>SOURCE : 保留在源文件
 *     <li>CLASS : 保留在class文件
 *     <li>RUNTIME : 保留在运行时
 * </ul>
 * ② @Target：定义注解的作用目标:
 * <ul>
 *     用于描述注解的范围，即注解在哪用。
 *     它说明了Annotation所修饰的对象范围：
 *     Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、
 *     类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）等。
 *     <ul>
 *         取值类型（ElementType）有以下几种：
 *         <li>CONSTRUCTOR:用于描述构造器
 *         <li>FIELD:用于描述域即类成员变量
 *         <li>LOCAL_VARIABLE:用于描述局部变量
 *         <li>METHOD:用于描述方法
 *         <li>PACKAGE:用于描述包
 *         <li>PARAMETER:用于描述参数
 *         <li>TYPE:用于描述类、接口(包括注解类型) 或enum声明
 *         <li>TYPE_PARAMETER:1.8版本开始，描述类、接口或enum参数的声明
 *         <li>TYPE_USE:1.8版本开始，描述一种类、接口或enum的使用声明
 *     </ul>
 * </ul>
 * ③ @Document：说明该注解将被包含在javadoc中
 * <p>
 * ④ @Inherited：说明子类可以继承父类中的该注解:
 * <ul>
 *     用于表示某个被标注的类型是被继承的。
 *     如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类。
 * </ul>
 * <p>
 * @author 周辰
 * @version 1.0
 * @时间：   2023/8/29
 */
//YuanAnnotation -> 元注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//@Inherited

@interface YuanAnnotation{
}

