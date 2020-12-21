package com.fuxy.fusion.annotation;

import java.lang.annotation.*;
import java.util.Collection;

/**
 *
 * 标示Dto中待聚合字段，聚合结果的来源是指定的Json串的某些属性。
 *
 * <p>
 * 该注解用于标示在Dto中需要聚合的字段，某个类中的某个属性被该
 * 注解修饰时，表示在返回时，该字段需要聚合某些属性，该属性值的来源
 * 取决于该注解中{@see target}的JSON串中的属性。
 * </p>
 *
 * @author JasonFuxy
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonFusionField {

    /**
     * JSON数据源
     *
     * @return 目标微服务或者本服务的某个service
     */
    String target() default "";

    /**
     * 查询字段
     * @return 查询字段
     */
    String condition() default "";

    /**
     * 目标值的字段名，当值为：Object时，表示本次查询为一个对象
     * @return 目标值的字段名
     */
    String targetField() default "";


}
