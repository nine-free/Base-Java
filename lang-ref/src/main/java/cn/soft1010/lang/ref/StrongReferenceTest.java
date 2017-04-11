package cn.soft1010.lang.ref;

/**
 * Created by zhangjifu on 2017/4/10.
 */
public class StrongReferenceTest {

    public static void main(String[] args) {

        new StrongReferenceTest().test();
    }

    /**
     * 强引用 内存不足 抛出OOM异常
     */
    public void test() {
        for (int i = 0; i < 10000; i++) {
            String[] arr = new String[1003300000];
        }
    }
}
