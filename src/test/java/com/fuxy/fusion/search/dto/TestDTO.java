package com.fuxy.fusion.search.dto;

import com.fuxy.fusion.annotation.Fusion;
import com.fuxy.fusion.annotation.FusionConditionField;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * 搜寻器测试类--用于单元测试。
 *
 * <p>该类中的属性模拟为真实开发场景中可能存在的情况。
 *    暂时先放入二十个属性，且这二十个属性都是待聚合的字段，来测试搜寻器的性能！
 * </p>
 *
 * @author JasonFu
 */
@Accessors(chain = true)
@Data
@Builder
public class TestDTO {

    private String fusionField_1;

    private String fusionField_2;

    private String fusionField_3;

    private String fusionField_4;

    private String fusionField_5;

    // private String fusionField_6;

    /*private String fusionField_7;

    private String fusionField_8;

    private String fusionField_9;

    private String fusionField_10;

    private String fusionField_11;

    private String fusionField_12;

    private String fusionField_13;

    private String fusionField_14;

    private String fusionField_15;

    private String fusionField_16;

    private String fusionField_17;

    private String fusionField_18;

    private String fusionField_19;

    private String fusionField_20;*/

}
