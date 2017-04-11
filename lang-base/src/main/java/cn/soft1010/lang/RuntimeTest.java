package cn.soft1010.lang;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class RuntimeTest {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("----- hook -------");
            }
        }));


    }
}
