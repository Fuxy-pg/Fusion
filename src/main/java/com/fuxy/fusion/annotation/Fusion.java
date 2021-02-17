package com.fuxy.fusion.annotation;

import java.lang.annotation.*;

/**
 *
 * 标示当前Dto为目标类。
 *
 * @author JasonFu
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface Fusion {

    /**
     * 当前目标类完整类名
     */
    String packageName() default "";

}
