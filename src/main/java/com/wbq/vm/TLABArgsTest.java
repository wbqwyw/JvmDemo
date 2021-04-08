package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-08 下午2:04
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("打酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
