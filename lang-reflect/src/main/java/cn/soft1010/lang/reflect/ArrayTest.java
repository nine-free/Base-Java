package cn.soft1010.lang.reflect;

import java.lang.reflect.Array;

/**
 * Created by zhangjifu on 2017/4/6.
 */
public class ArrayTest {

    public static void main(String[] args) {

        //创建数组实例
        String[] array = (String[]) Array.newInstance(String.class, 10);
        for (int i = 0; i < 10; i++) {
            // set值
            Array.set(array, i, "" + i);
        }

        //get 值
        String str = (String) Array.get(array, 0);
        System.out.println(str);

        // 创建多维数组
        String[][] arr = (String[][]) Array.newInstance(String.class, 2, 2);
        int i = 0;

        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                arr[m][n] = "" + i++;
            }
        }

        System.out.println(arr[1][1]);

        Long[] arrl = (Long[]) Array.newInstance(Long.class, 2);
        System.out.println("length:" + arrl.length);
        arrl[0] = 0L;
        arrl[1] = 1L;
        System.out.println(Array.get(arrl, 0));
//        System.out.println(Array.getLong(arrl, 0));

    }
}
