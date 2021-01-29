package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 上午10:51
 * @description 查看是否能回收bytes内存空间
 */
public class Test {
    public static void main(String[] args) {
        byte[] bytes = new byte[64 * 1024 * 1024];
        System.gc();
    }
}
