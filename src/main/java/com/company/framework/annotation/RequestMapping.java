package com.company.framework.annotation;

import java.lang.annotation.*;

//@RequestMapping可以用在类、接口、注解对象上，也可以用在方法上
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
