package com.soft1010.lang.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zhangjifu on 2017/3/31.
 */
public class TestMain {

    public static void main(String[] args) {

        A a = new A();
        Annotation annotation = a.getClass().getAnnotation(TestAnnotation.class);

        System.out.println(annotation.annotationType().getName());


        B b = new B();
        Annotation annotation1 = b.getClass().getAnnotation(TestAnnotation.class);
        System.out.println(annotation1.annotationType().getName());

        try {
            TestAnnotation annotation2 = a.getClass().getMethod("test", String.class).getAnnotation(TestAnnotation.class);
            annotation2.value();
            Method[] methods = a.getClass().getMethods();
            for (Method me : methods
                    ) {
                Annotation[] annotations = me.getAnnotations();
                for (Annotation an : annotations
                        ) {

                    System.out.println(an.annotationType().getName());
                }
            }

            Field[] fields = a.getClass().getDeclaredFields();
            for (Field field : fields
                    ) {
                TestAnnotation an2 = field.getAnnotation(TestAnnotation.class);
                System.out.println("----" + field + "-" + an2.name());
            }

            System.out.println(annotation2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
