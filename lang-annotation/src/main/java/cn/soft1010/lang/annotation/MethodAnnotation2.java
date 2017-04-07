package cn.soft1010.lang.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangjifu on 2017/4/1.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodAnnotation2 {

    String name();

    String key() default "";
}
