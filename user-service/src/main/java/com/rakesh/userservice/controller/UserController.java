package com.rakesh.userservice.controller;

import com.rakesh.userservice.entity.User;
import com.rakesh.userservice.pojo.ResponseTemplateVO;
import com.rakesh.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser of UserController");
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserById(@PathVariable("id") Long id){
        log.info("inside findUserById method of UserController");
        return service.findUserById(id);
    }
}
