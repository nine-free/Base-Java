package com.soft1010.lang.classes;

/**
 * Created by zhangjifu on 2017/3/20.
 */
public class ByteTest {

    public static void main(String[] args) {

        Byte b1 = Byte.decode("1");
        Byte b2 = Byte.valueOf("127");
        Byte b3 = Byte.valueOf("-128");
        Byte b4 = Byte.valueOf("f", 16);
        System.out.println(b1 + " | " + b2 + " | " + b3 + " | " + b4);

        Integer i = 0;
        System.out.println(i.byteValue());
    }
}
