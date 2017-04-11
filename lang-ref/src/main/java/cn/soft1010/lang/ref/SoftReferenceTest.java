package cn.soft1010.lang.ref;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * Created by zhangjifu on 2017/4/10.
 */
public class SoftReferenceTest {

    public static void main(String[] args) throws InterruptedException {

        new SoftReferenceTest().test();
    }

    public void test() {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        SoftReference<String> softReference = new SoftReference("123", referenceQueue);
        System.out.println("before:" + softReference.get().toString());

        for (int i = 0; i < 10000; i++) {
            System.gc();
            String[] str = new String[300000000];
            SoftReference<String[]> softReference1 = new SoftReference<String[]>(str, referenceQueue);
            str = null;
            System.out.println(referenceQueue.poll() == null ? "" : referenceQueue.poll().get() + "--" + i);
        }

        System.out.println("after:" + softReference.get().toString());
    }
}
