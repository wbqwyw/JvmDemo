package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 下午2:14
 *
 * @description 方法的静态解析演示
 */
public class StaticResolution {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        StaticResolution.sayHello();
    }
}
