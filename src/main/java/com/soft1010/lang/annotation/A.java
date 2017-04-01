package com.soft1010.lang.annotation;


/**
 * Created by zhangjifu on 2017/3/31.
 */
@TestAnnotation(value = "", name = "")
public class A {

    @TestAnnotation(name = "zhang")
    public void test(String param) {
        System.out.println("------test------" + param);
    }

    @TestAnnotation(name = "field")
    private String name;

}
