package cn.soft1010.lang;

import java.io.IOException;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class RuntimeTest {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----- hook -------");
            }
        }));

        Integer processors = Runtime.getRuntime().availableProcessors();
        System.out.println("内核processors:" + processors);

        try {
            Process process = Runtime.getRuntime().exec("ping baidu.com");
            System.out.println(" execute command ping baidu.com");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("freememory:" + freeMemory / 1024 / 1024 + "m");

        long maxmemory = Runtime.getRuntime().maxMemory();
        System.out.println("maxmemory:" + maxmemory / 1024 / 1024);

        Runtime.getRuntime().gc();
        System.gc();


    }
}
