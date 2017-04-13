package cn.soft1010.lang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjifu on 2017/4/13.
 */
public class StringTest {


    public static void main(String[] args) {
        new StringTest().test();
    }

    private void test() {
        System.out.println("=============string constructor==============");
        String str = new String("str");
        System.out.println(str);

        try {
            String str1 = new String("str".getBytes(), "utf-8");
            System.out.println(str1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("=====================================");
        System.out.println("1".concat("+").concat("1").concat("=").concat("2"));

        System.out.println("abcd1234".contains("d1"));
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(String.join(",", list));


    }

}


