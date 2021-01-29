package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 上午11:11
 * @description 查看是否能回收bytes内存空间
 */
public class Test2 {
    public static void main(String[] args) {
        {
            byte[] bytes = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        //必须初始化
        boolean b = false;
        System.out.println(b);
        System.gc();
    }
}
