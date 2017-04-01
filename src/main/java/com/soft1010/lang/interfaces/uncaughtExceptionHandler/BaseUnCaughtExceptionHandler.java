package com.soft1010.lang.interfaces.uncaughtExceptionHandler;

/**
 * Created by zhangjifu on 2017/3/20.
 */
public class BaseUnCaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("catch a uncaughtException " + t.getName() + " - " + e.getMessage());
        e.printStackTrace();
    }
}
