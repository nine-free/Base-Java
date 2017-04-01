package com.soft1010.lang.annotation;

/**
 * Created by zhangjifu on 2017/4/1.
 */
@ClassAnnotation
public class ClassA {

    @FieldAnnotation
    private String field;


    @MethodAnnotation1
    public void test1() {
        System.out.println("-----test1()----");
    }

    @MethodAnnotation2(name = "zhang")
    public void test2(String name) {
        System.out.println("------test2()------- name=" + name);
    }


    public void test3(@TestParam(isNUll = false, name = "param1", configs = {"1", "2"}) String param) {
        System.out.println("-----test3------");
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
