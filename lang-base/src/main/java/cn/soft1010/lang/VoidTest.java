package cn.soft1010.lang;

import java.lang.reflect.Method;

/**
 * Created by zhangjifu on 2017/4/12.
 */
public class VoidTest {
    public static void main(String[] args) {

        Method[] methods = VoidTest.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + method.getReturnType());
            //判断一个方法是否返回空
            if (method.getReturnType().equals(Void.TYPE)) {
                System.out.println(method.getName() + " return void");
            }
        }
    }
}
