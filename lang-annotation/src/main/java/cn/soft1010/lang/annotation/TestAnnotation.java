package cn.soft1010.lang.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zhangjifu on 2017/4/1.
 */
public class TestAnnotation {

    public static void main(String[] args) {

        // 1、类注解
        ClassA classA = new ClassA();
        ClassAnnotation classAnnotation = classA.getClass().getAnnotation(ClassAnnotation.class);
        System.out.println(classAnnotation.annotationType().getName());


        //2、注解方法
        Method[] methods = classA.getClass().getMethods();
        for (Method me : methods
                ) {
            MethodAnnotation1 methodAnno1 = me.getAnnotation(MethodAnnotation1.class);
            if (methodAnno1 != null) {
                System.out.println("method:" + me.getName() + " | annotation:" + methodAnno1.annotationType().getName());
            }
            MethodAnnotation2 methodAnno2 = me.getAnnotation(MethodAnnotation2.class);
            if (methodAnno2 != null) {
                System.out.println("method:" + me.getName() + " | name:" + methodAnno2.name() +
                        " | annotation:" + methodAnno2.annotationType().getName());
            }
        }


        // 3、字段注解

        Field[] fields = classA.getClass().getFields();
        for (Field field : fields
                ) {
            FieldAnnotation fieldAnno = field.getAnnotation(FieldAnnotation.class);
            System.out.println(field.getName() + " | annotation" + fieldAnno.annotationType().getName());
        }

        Field[] fields2 = classA.getClass().getDeclaredFields();
        for (Field field : fields2
                ) {
            FieldAnnotation fieldAnno = field.getAnnotation(FieldAnnotation.class);
            System.out.println(field.getName() + " | annotation" + fieldAnno.annotationType().getName());
        }


        //4、参数注解
        Method[] methods2 = classA.getClass().getDeclaredMethods();
        for (Method me : methods2
                ) {
            Annotation[][] parameterAnnotations = me.getParameterAnnotations();
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations
                        ) {
                    if (annotation instanceof ParamAnnotation) {
                        ParamAnnotation anno = (ParamAnnotation) annotation;
                        System.out.println("method:" + me.getName() + " | anno:" + anno.annotationType().getName());
                    }
                }
            }
        }

    }
}
