package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-08 下午5:43
 */
public class StringTest {
    String str = "good";
    char[] cha = {'t', 'e', 's', 't'};

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.change(stringTest.str, stringTest.cha);
        System.out.println(stringTest.str);
        System.out.println(stringTest.cha);
    }

    public void change(String str, char[] cha) {
        str = "will";
//        this.str = "will";
        cha[0] = 'b';

    }

}
