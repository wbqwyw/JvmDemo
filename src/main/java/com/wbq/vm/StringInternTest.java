package com.wbq.vm;

import org.junit.Test;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-09 上午11:33
 */
public class StringInternTest {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        //s = s.intern();
        String s1 = "1";
        //因为new String("1")时，创建两个对象
        //一个new String在堆内存中开辟
        //一个在常量池中的"1"
        //而String s = 的值是堆中对象的地址值，而不是
        //常量池中字符串对象的地址
        //而s1指向的是字符串常量池中的地址，如果上述代码改成s = s.intern();
        //则结果是jdk6 = false jdk7/8 = true
        //否则结果是jdk6 = false jdk7/8 = false
        System.out.println(s == s1);
        String s2 = new String("1") + new String("1");
        s2.intern();
        String s3 = "11";
        /*
        * String s2表达式，是由StringBuffer字符串拼接操作，然后再调用toString方法生成的对象
        * 并没有将对象结果放入字符串常量池中。
        * jdk6中，intern()方法是创建一个对象"11"
        * jdk7/8中，并没有创建对象，而是在字符串常量池中创建一个指向堆中"11"对象的指针地址
        * 所以s3返回的是等于s2的地址
        * */
        //jdk6 = false jdk7/8 = true
        System.out.println(s2 == s3);
    }
}
