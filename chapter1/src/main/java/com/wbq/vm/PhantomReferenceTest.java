package com.wbq.vm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @ClassName PhantomReferenceTest
 * @Description TODO
 * @Author wbq
 * @Date 2021/4/11 13:25
 * @Version 1.0
 * 弱引用示例
 */
public class PhantomReferenceTest {
    public static PhantomReferenceTest obj = null;
    static ReferenceQueue<PhantomReferenceTest> refQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            while (true) {
                if (refQueue != null) {
                    PhantomReference<PhantomReferenceTest> objt = null;
                    try {
                        objt = (PhantomReference<PhantomReferenceTest>) refQueue.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (objt != null) {
                        System.out.println("追踪垃圾回收过程：PhantomReferenceTest的实例被GC了");
                    }
                }
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类的finalize()方法了");
        obj = this;
    }

    public static void main(String[] args) {
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();
        obj = new PhantomReferenceTest();
        refQueue = new ReferenceQueue<PhantomReferenceTest>();
        PhantomReference<PhantomReferenceTest> phantomReference = new PhantomReference<PhantomReferenceTest>(
                obj, refQueue);
        System.out.println(phantomReference.get());
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj是null");
            } else {
                System.out.println("obj对象还存活");
            }
            System.out.println("第二次回收");
            obj = null;
            System.gc();
            Thread.sleep(1000);
            if (obj == null) {
                System.out.println("obj是null");
            } else {
                System.out.println("obj对象还存活");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
