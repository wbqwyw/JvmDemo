package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-09 下午4:34
 */
public class StringExpr1 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");
        String s2 = s.intern();
        System.out.println(s2 == "ab");//jdk1.6 true jdk1.7/1.8 true
        System.out.println(s == "ab");//jdk1.6 false jdk1.7/1.8 true
    }
}
