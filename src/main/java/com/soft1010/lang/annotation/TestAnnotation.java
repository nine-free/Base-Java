package com.soft1010.lang.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangjifu on 2017/3/31.
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

    String value() default "";

    String name();

}
