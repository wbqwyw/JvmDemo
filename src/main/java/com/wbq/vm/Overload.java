package com.wbq.vm;

import java.io.Serializable;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 下午4:03
 *
 * @description 静态分派
 */
public class Overload {
    //此方法执行后，则执行char...args,数组参数
    public static void sayHello(Object obj) {
        System.out.println("Object");
    }

    //此方法注释之后，则执行long
    public static void sayHello(int i) {
        System.out.println("int");
    }

    //此方法注释之后，则执行Character
    public static void sayHello(long l) {
        System.out.println("long");
    }

    //此方法注释之后，则执行Serializable，但是不能同时又Comparable,因为两者优先级一致，因此不知道执行哪个
    public static void sayHello(Character character) {
        System.out.println("character");
    }

    //此方法注释之后，则执行int
    public static void sayHello(char ch) {
        System.out.println("char");
    }

    //此方法最后执行
    public static void sayHello(char... args) {
        System.out.println("char……");
    }

    //此方法注释后，执行Object
    public static void sayHello(Serializable serializable) {
        System.out.println("serializable");
    }

    public static void sayHello(Comparable comparable) {
        System.out.println("comparable");
    }

    public static void main(String[] args) {
        Overload.sayHello('a');
    }

}
