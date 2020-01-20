package com.godtrue.annotation.simple1.self.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface InitSex {
    enum SEX_TYPE{MAN,WOMAN};
    SEX_TYPE sex() default SEX_TYPE.MAN;
}
