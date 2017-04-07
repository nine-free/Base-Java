package cn.soft1010.lang.reflect;

import java.lang.reflect.Method;

/**
 * Created by zhangjifu on 2017/4/6.
 */
public class MethodTest {

    public static void main(String[] args) {

        MethodA methodA = new MethodA();
        Method[] methods = methodA.getClass().getMethods();
        try {
            Method method = methodA.getClass().getMethod("test", String.class);
            System.out.println(method.getReturnType());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        for (Method me : methods
                ) {
            System.out.println(me.getName());
        }

    }
}
