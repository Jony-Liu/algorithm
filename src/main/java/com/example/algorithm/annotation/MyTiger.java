package com.example.algorithm.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * @author Jony-Liu
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(METHOD)
public @interface MyTiger {

    String value() default "默认值";

}
