package com.wbq.vm;

/**
 * 包名：com.wbq.vm
 * 工程：JvmDemo
 * 作者: wangbq
 * 时间:  2021-01-29 下午4:51
 *
 * @description 字段不参与多态
 */
public class FieldHasNoPolymorphic {

    static class Father {
        public int money = 1;

        public Father() {
            money = 2;
            showMeTheMoney();
        }

        public void showMeTheMoney() {
            System.out.println("I am Father , i have $" + money);
        }
    }

    static class Son extends Father {
        public int money = 3;

        public Son() {
            money = 4;
            showMeTheMoney();
        }

        @Override
        public void showMeTheMoney() {
            System.out.println("I am Son, I Have $" + money);
        }
    }

    public static void main(String[] args) {
        /**
         *Son 类再初始化的时候，会隐式调用父类构造方法，但是父类执行时会先找子类该方法，有则执行子类的方法
         * ，但是此时子类的money属性还未初始化，为0.所以打印的是0.
         * 然后再执行下面的show方法，打印4
         * 最后获取的是父类的money属性，而不是子类的money属性，从而说明了字段不参与多态
         * */
        Father son = new Son();
        System.out.println("This gay has $" + son.money);
    }
}
