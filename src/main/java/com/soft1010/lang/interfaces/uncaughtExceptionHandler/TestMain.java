package com.soft1010.lang.interfaces.uncaughtExceptionHandler;

/**
 * Created by zhangjifu on 2017/3/20.
 */
public class TestMain {


    public static void main(String[] args) {
        BaseThread threadA = new BaseThread();
        threadA.setName("test");
        BaseUnCaughtExceptionHandler baseUnCaughtExceptionHandler = new BaseUnCaughtExceptionHandler();
        threadA.setUncaughtExceptionHandler(baseUnCaughtExceptionHandler);
        threadA.start();
    }

}
