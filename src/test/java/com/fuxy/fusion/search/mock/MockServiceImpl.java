package com.fuxy.fusion.search.mock;

import com.fuxy.fusion.search.dto.TestDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "test")
@Service
public class MockServiceImpl implements MockService{

    @Override
    public TestDTO findByCondition(Long id) {
        TestDTO testDTO = TestDTO.builder().build();
        testDTO.setFusionField_1("field1")
                .setFusionField_2("field2")
                .setFusionField_3("field3")
                .setFusionField_4("field4")
                .setFusionField_5("field5");
        return testDTO;
    }
}
