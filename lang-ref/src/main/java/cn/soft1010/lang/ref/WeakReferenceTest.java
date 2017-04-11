package cn.soft1010.lang.ref;

import java.lang.ref.WeakReference;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class WeakReferenceTest {

    public static void main(String[] args) {
        new WeakReferenceTest().test();
    }

    /**
     * 弱引用  只要gc 就会被回收
     */
    private void test() {

        WeakReference<String> str = new WeakReference<String>(new String("123"));

        System.out.println(str.get());
        System.gc();

        System.out.println(str.get());
    }
}
