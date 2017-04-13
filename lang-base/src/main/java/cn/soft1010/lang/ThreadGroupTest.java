package cn.soft1010.lang;

/**
 * Created by zhangjifu on 2017/4/12.
 */
public class ThreadGroupTest {

    public static void main(String[] args) {
        try {
            new ThreadGroupTest().test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void test() throws InterruptedException {

        ThreadGroup threadGroup = new ThreadGroup("threadGroup");

        FirstThread firstThread = new FirstThread();
        for (int i = 0; i < 10; i++) {
            //把线程注册到线程组
            Thread thread = new Thread(threadGroup, firstThread);
            thread.start();
        }

        SecondThread secondThread = new SecondThread();
        for (int i = 0; i < 10; i++) {
            //把线程注册到线程组
            Thread thread = new Thread(threadGroup, secondThread);
            thread.start();
        }

        Thread.sleep(1000L);
        //打印活动线程数
        System.out.println(threadGroup.activeCount());

        //中断线程
        threadGroup.interrupt();
    }

    class FirstThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
                System.out.println("------first start-------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class SecondThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
                System.out.println("------second start-------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
