package com.fuxy.fusion.search.dto;

import com.fuxy.fusion.annotation.FusionConditionField;
import lombok.Data;

@Data
public class TargetDTO {

    @FusionConditionField(condition = "id")
    private Long id;

    private String targetField_1;

    private String targetField_2;

    private String targetField_3;

    private String targetField_4;

    private String targetField_5;

    //private String targetField_6;

}
