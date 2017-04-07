package cn.soft1010.lang.instrument;

/**
 * Created by zhangjifu on 2017/4/5.
 */
public class TestMain {
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------我还活着------");
        }
    }
}
