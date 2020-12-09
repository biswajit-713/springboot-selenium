package com.twhydqa.automationdemo.spreedemo.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Lazy
@Configuration
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyConfiguration {
}
