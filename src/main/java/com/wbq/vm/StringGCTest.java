package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-09 下午5:40
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 */
public class StringGCTest {
    public static void main(String[] args) {
        //当100变成10000时，发生垃圾回收行为，说明字符串常量池是存在垃圾回收行为的
        //且字符串常量池中存放的不是10000
        for (int i = 0; i < 40000; i++) {
//            String.valueOf(i);
            String.valueOf(i).intern();
        }
    }
}
