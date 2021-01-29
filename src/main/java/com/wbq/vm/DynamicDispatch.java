package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 下午4:39
 *
 * @description 动态分派
 */
public class DynamicDispatch {

    public static abstract class Human {
        protected abstract void sayHello();
    }

    public static class Man extends Human {

        @Override
        protected void sayHello() {
            System.out.println("Man");
        }
    }

    public static class Woman extends Human {

        @Override
        protected void sayHello() {
            System.out.println("woman");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Woman();
        man.sayHello();
        women.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
