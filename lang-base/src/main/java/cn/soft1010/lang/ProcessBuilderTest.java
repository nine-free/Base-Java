package cn.soft1010.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class ProcessBuilderTest {

    public static void main(String[] args) {

        ProcessBuilder processBuilder = new ProcessBuilder("ping", "baidu.com");
        try {
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String tmp = "";
            while ((tmp = reader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ProcessBuilder processBuilder1 = new ProcessBuilder("D:/software/EditPlus 3/EditPlus.exe");

        try {
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
