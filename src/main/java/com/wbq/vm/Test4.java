package com.wbq.vm;

import org.junit.Rule;
import org.junit.Test;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-03-01 上午10:05
 */
public class Test4 {
    @Test
    public void test1() {
        String a = "a";
        String b = "b";
        String c = "ab";
        String d = a + b;
        String f = "a" + "b";
        System.out.println(c == d);
        System.out.println(c == f);
    }

    @Test
    public void test2() {
        final String a = "a";
        String b = "b";
        String c = "ab";
        String d = a + b;
        System.out.println(c == d);
    }

    @Test
    public void test3() {
        final String a = "a";
        final String b = "b";
        String c = "ab";
        String d = a + b;
        System.out.println(c == d);
    }

    @Test
    public void test4() {
        String a = "a";
        String b = "b";
        String f = "a" + "b";
        String c = "ab";
        System.out.println(c == f);
    }

    @Test
    public void test5() {
        new String("ab");
    }

    @Test
    public void test6() {
//        String b = new String("ab");
        String c = new String("a") + new String("b");
    }
}
