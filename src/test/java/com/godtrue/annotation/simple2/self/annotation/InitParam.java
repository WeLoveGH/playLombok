package com.godtrue.annotation.simple2.self.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface InitParam {
    String paramStr () default "";
    int paramInt() default -1;
}
