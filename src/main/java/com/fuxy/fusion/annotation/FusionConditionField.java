package com.fuxy.fusion.annotation;

import java.lang.annotation.*;
import java.util.Collection;

/**
 *
 * 标示Dto中聚合结果中的关联条件。
 *
 * <p>
 *  该注解用于在目标方法执行完之后，结果集于当前Dto的关联条件字段。通过这个字段能够关联起来执行结果于Dto中的字段。
 *  该注解作用在类上，通过该注解能够标示出当前dto的关联字段。
 * </p>
 *
 * <p>思考：对于复杂Dto的聚合，可能会存在多个字段需要聚合，且聚合的条件是不同的，此时这个注解就无法满足条件，
 *         需要对该注解进行一定的扩展，使其满足能够多个条件。
 * </p>
 *
 * @author JasonFuxy
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FusionConditionField {

    /**
     * 聚合条件字段
     */
    String condition() default "";

}
