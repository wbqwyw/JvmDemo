package com.wbq.vm;

/**
 * @ClassName JHSDB_TestCase
 * @Description TODO
 * @Author Administrator
 * @Date 2021/1/27 11:34
 * @Version 1.0
 */
public class JHSDB_TestCase {
    public static void main(String[] args) throws InterruptedException {
        Test test = new JHSDB_TestCase.Test();
        test.foo();
    }

    private static class ObjectHolder {
    }

    static class Test {
        static ObjectHolder staticObjectHolder = new ObjectHolder();
        ObjectHolder instanceObject = new ObjectHolder();

        public void foo() throws InterruptedException {
            ObjectHolder localObject = new ObjectHolder();
            Thread.sleep(1000*60*10);
            System.out.println("OK");
        }
    }

}
