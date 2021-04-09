package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-09 下午4:44
 */
public class StringExpr2 {
    public static void main(String[] args) {
//        String s1 = new String("ab");
        String s1 = new String("a") + new String("b");
        s1.intern();
        String s2 = "ab";
        /*
         * 如果是第一种：jdk1.6 false jdk1.7/1.8 false
         * 如果是第二种：jdk1.6 false jdk1.7/1.8 true
         * */
        System.out.println(s1 == s2);
    }
}
