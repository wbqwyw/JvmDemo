package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-04-09 下午5:19
 * String.intern()空间效率测试
 */
public class StringIntern {
    public static final int MAX = 1000 * 10000;
    public static final String[] arr = new String[MAX];

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX; i++) {
//            arr[i] = new String(String.valueOf(data[i % data.length]));
            arr[i] = String.valueOf(data[i % data.length]);
//            arr[i] = new String(String.valueOf(data[i % data.length])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
    }

}
