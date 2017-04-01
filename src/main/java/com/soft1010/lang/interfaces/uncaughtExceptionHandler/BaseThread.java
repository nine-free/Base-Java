package com.soft1010.lang.interfaces.uncaughtExceptionHandler;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zhangjifu on 2017/3/20.
 */
public class BaseThread extends Thread {

    private static AtomicLong atomicLong = new AtomicLong(1);

    @Override
    public void run() {
        this.setName("thread-" + this.getName() + "-" + atomicLong.getAndAdd(1));
        System.out.println(this.getName() + " ---start--- ");
        long start = System.currentTimeMillis();
        //这里将发生异常
        int i = 12 / 1;
        System.out.printf("threadA end 耗时=[" + (System.currentTimeMillis() - start));
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        super.setUncaughtExceptionHandler(eh);
    }

}


