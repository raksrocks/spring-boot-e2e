package com.rakesh.userservice.service;

import com.rakesh.userservice.entity.User;
import com.rakesh.userservice.pojo.Department;
import com.rakesh.userservice.pojo.ResponseTemplateVO;
import com.rakesh.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("inside saveUser of userService");
        return repo.save(user);
    }

    public ResponseTemplateVO findUserById(Long id) {
        log.info("inside method findUserById of Use Service. Id:" + id);
        User user = repo.findByUserId(id);
        ResponseTemplateVO vs = new ResponseTemplateVO();
        vs.setUser(user);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        vs.setDept(department);
        return vs;
    }
}
