package com.soft1010.lang.interfaces.AutoCloseable;

import java.io.IOException;

/**
 * Created by zhangjifu on 2017/3/29.
 */
public final class ResourceControl implements AutoCloseable {

    private StringBuffer stringBuffer = new StringBuffer();

    public void close() throws Exception {
        System.out.println("------close--------");
    }

    public String read(String str) throws IOException {
        return stringBuffer.append(str).toString();
    }


}
