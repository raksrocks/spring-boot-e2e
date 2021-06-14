package com.rakesh.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User service dobbbindi royyy";
    }

    @GetMapping("/deptServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "Department service dobbbindi royyy";
    }
}
