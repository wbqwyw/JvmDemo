package com.wbq.vm;

import org.junit.Test;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-08 下午6:17
 */
public class StringTest2 {
    @Test
    public void test1() {
        String s1 = "1" + "2" + "3";
        String s2 = "123";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
