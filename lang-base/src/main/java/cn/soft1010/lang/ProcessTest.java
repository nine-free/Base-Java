package cn.soft1010.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class ProcessTest {

    private static final String COMMAND = "ping baidu.com";

    public static void main(String[] args) throws IOException {

        Process process = Runtime.getRuntime().exec(COMMAND);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        OutputStreamWriter writer = new OutputStreamWriter(process.getOutputStream());
//        writer.write("ping google.cn");
        String tmp = "";
        while ((tmp = bufferedReader.readLine()) != null) {
            System.out.println(tmp);
        }
    }
}
