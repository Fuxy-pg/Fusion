package com.fuxy.fusion.search.mock;

import com.fuxy.fusion.search.dto.TestDTO;



public interface MockService {

    TestDTO findByCondition(Long id);

}
