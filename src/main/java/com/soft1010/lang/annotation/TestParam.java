package com.soft1010.lang.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangjifu on 2017/4/1.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface TestParam {

    boolean isNUll() default false;

    String name();

    String[] configs();
}
