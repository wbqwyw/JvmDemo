package com.wbq.vm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassName DirectoryMemoryUnsafeOom
 * @Description TODO
 * @Author wbq
 * @Date 2021/4/10 19:20
 * @Version 1.0
 * -Xms20m -Xmx20m -XX:MaxDirectMemorySize=10m
 */
public class DirectoryMemoryUnsafeOom {

    public static final int _1M = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1M);
        }
    }
}
