package com.soft1010.lang.interfaces.AutoCloseable;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhangjifu on 2017/3/29.
 */
public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("");
        int data = fileInputStream.read();
        while (data != -1) {
            System.out.println(data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
