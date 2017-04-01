package com.soft1010.lang.classes;

/**
 * Created by zhangjifu on 2017/3/20.
 */
public class BooleanTest {

    public static void main(String[] args) {
        Boolean b1 = new Boolean(false);
        Boolean b2 = new Boolean(false);
        boolean b3 = false;
        //两个对象 false
        System.out.println("b1==b2 ? " + (b1 == b2));
        System.out.println();

        // boolean 值相同 true |  前true后false >0  | 前false后true <0
        System.out.println("b1.compareTo(b2? " + b1.compareTo(b2));

        //两个对象 boolean value相同是返回true
        System.out.println("b1.equals(b2) ? " + b1.equals(b2));

        System.out.println(b1.equals(true));

        System.out.println(Boolean.valueOf("1"));
        System.out.println(Boolean.valueOf("True"));


    }
}
