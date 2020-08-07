package com.fuxy.fusion;

import com.fuxy.fusion.dynamic.DynamicGenerateClassUtil;
import com.fuxy.fusion.test.LeapRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JasonFuxy
 */
@RestController
@SpringBootApplication
public class FusionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FusionApplication.class, args);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() throws Exception {
        return new DynamicGenerateClassUtil().dynamicClass(new LeapRole());
    }


}
