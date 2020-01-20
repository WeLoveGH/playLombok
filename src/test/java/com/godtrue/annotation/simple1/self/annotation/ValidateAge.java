package com.godtrue.annotation.simple1.self.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface ValidateAge {
    int min() default 18;
    int max() default 180;
    int value() default 30;
}
