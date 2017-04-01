package com.soft1010.lang.interfaces.AutoCloseable;


/**
 * Created by zhangjifu on 2017/3/29.
 */
public class AutoCloseTest {
    public static void main(String[] args) {
        try (ResourceControl resourceControl = new ResourceControl()) {
            resourceControl.read("123");
            resourceControl.read("abc");
        } catch (Exception e) {

        }
    }

}
