package com.rakesh.department.controller;

import com.rakesh.department.entity.Department;
import com.rakesh.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department department){
        log.info("inside saveDepartment of DepartmentController");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long deptId){
        log.info("inside findDepartmentById of DepartmentController");
        return service.findDepartmentById(deptId);
    }
}
