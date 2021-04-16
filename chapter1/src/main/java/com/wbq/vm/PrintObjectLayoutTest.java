package com.wbq.vm;

import org.openjdk.jol.info.ClassLayout;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-15 上午9:35
 */
public class PrintObjectLayoutTest {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
