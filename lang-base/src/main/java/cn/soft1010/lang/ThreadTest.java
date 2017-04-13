package cn.soft1010.lang;

/**
 * Created by zhangjifu on 2017/4/13.
 */
public class ThreadTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread();
        Thread thread2 = new Thread("name2");
//        Thread.currentThread().interrupt();
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3----");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        ThreadGroup tg = new ThreadGroup("tg");

        new Thread(tg, new Runnable() {
            @Override
            public void run() {
                System.out.println("thread4---" + Thread.currentThread().getName() + " group=" + Thread.currentThread().getThreadGroup().getName());
            }
        }, "name4").start();


    }

    private void test() {

    }

}
