package cn.soft1010.lang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by zhangjifu on 2017/4/12.
 */
public class ThreadLocalTest {

    static final ExecutorService executors = Executors.newCachedThreadPool(new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setDaemon(true);
            return t;
        }
    });

    static final ThreadLocal<Config> threadLocalConfig = new ThreadLocal<>();

    public static void main(String[] args) {

        //主进程设置
        threadLocalConfig.set(new Config("main", 1234));

        //一个新进程设置
        executors.execute(new Runnable() {
            @Override
            public void run() {
                Config config = new Config("zhang", 12);
                threadLocalConfig.set(config);
            }
        });

        executors.execute(new Runnable() {
            @Override
            public void run() {
                Config config = new Config("xiao", 123);
                threadLocalConfig.set(config);
            }
        });

        //拿到主进程的配置
        Config obj = threadLocalConfig.get();
        System.out.println(obj.toString());
    }


    static class Config {
        private String name;
        private Integer age;

        public Config(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Config{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
