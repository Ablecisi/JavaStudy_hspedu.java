package com.zcedu.annotation_;

/**
 * @author 周辰
 * @version 1.0
 */
public class Annotation {
    //重写注解
    @Override
    public  String toString() {
        return "@Override注解";
    }

    @SuppressWarnings({"unused",})//该处为，抑制未被使用的警告
    int i;
    /**这里是一些参照：可抑制的警告
    使用方式：@SuppressWarnings({"all"})
    all：抑制所有警告
    boxing：抑制与封装/拆装作业相关的警告
    cast：抑制与强制转型相关的警告
    dep-ann：抑制与淘汰注释相关的警告
    deprecation：抑制与淘汰相关的警告
    fallthrough：抑制与switch陈述式中遗漏break相关的警告
    finally：抑制与未传回finally区块相关的警告
    hiding：抑制与隐藏变数的区域变数相关的警告
    incomplete-switch：抑制与switch陈述式（enum、case）中遗漏项目相关的警告
    javadoc：抑制与javadoc相关的警告
    nls：抑制与非nls字符串文字相关的警告
    null：抑制与空值分析相关的警告
    rawtypes：抑制与使用raw类型相关的警告
    resource：抑制与使用Closeable类型的资源相关的警告
    restriction：抑制与使用不建议或禁止参照相关的警告
    serial：抑制与可序列化的类别遗漏serialVersionUID栏位相关的警告
    static-access：抑制与静态存取不正确相关的警告
    static-method：抑制与可能宣告为static的方法相关的警告
    super ：抑制与置换方法相关但不含super呼叫的警告
    synthetic-access：抑制与内部类别的存取未最佳化相关的警告
    sync-override：抑制因为置换同步方法而遗漏同步化的警告
    unchecked：抑制与未检查的作业相关的警告
    unqualified-field-access：抑制与栏位存取不合格相关的警告
    unused：抑制与未用的程序码及停用的程序码相关的警告
    */

    @Deprecated
    public static void add(){
        System.out.println("add");
    }
}
class Add{
    public static void main(String[] args){
        Annotation.add();//已经弃用，可以用但是会有警告
    }
}
