import java.io.*;
import java.util.Comparator;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class ClassTest {

    public static void main(String[] args) {

        //isAnonymousClass() 是否匿名内部类
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println(this.getClass().isAnonymousClass());
                return 0;
            }
        };
        comparator.compare(1, 2);

        try {
            Process process = Runtime.getRuntime().exec("ping baidu.com");
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String tmp = "";
            while ((tmp = inputStream.readLine()) != null)
                System.out.println(tmp);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
