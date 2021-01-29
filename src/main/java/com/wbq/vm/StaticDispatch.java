package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 下午3:18
 */
public class StaticDispatch {

    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }

    public static void sayHello(Human man) {
        System.out.println("human");
    }

    public static void sayHello(Man man) {
        System.out.println("man");
    }

    public static void sayHello(Woman woman) {
        System.out.println("woman");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch.sayHello(man);
        StaticDispatch.sayHello(woman);
    }

}
