package com.rakesh.department.service;

import com.rakesh.department.entity.Department;
import com.rakesh.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return repo.save(department);

    }

    public Department findDepartmentById(Long deptId) {
        log.info("inside findDepartmentById of DepartmentService");
        return repo.findByDepartmentId(deptId);
    }
}
