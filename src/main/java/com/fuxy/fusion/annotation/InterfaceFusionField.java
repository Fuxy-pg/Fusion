package com.fuxy.fusion.annotation;

import java.lang.annotation.*;
import java.util.Collection;

/**
 *
 * 标示Dto中待聚合字段，聚合结果的来源是指定的接口执行结果。
 *
 * <p>
 * 该注解用于标示在Dto中需要聚合的字段，某个类中的某个属性被该
 * 注解修饰时，表示在返回时，该字段需要聚合某些属性，该属性值的来源
 * 取决于该注解中targetService的执行结果。
 * </p>
 *
 * @author JasonFuxy
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InterfaceFusionField {

    /**
     * 目标类
     * @return 目标微服务或者本服务的某个service
     */
    String target() default "";

    /**
     * 调用方法
     * @return 调用的目标方法
     */
    String method() default "";

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

    /**
     * 默认查询Collection，特殊类型需自行指定
     * @return Class
     */
    Class clazz() default Collection.class;


}
