package com.ren.ping.fileuploadsvc.controller;

import com.ren.ping.fileuploadsvc.entity.User;
import com.ren.ping.fileuploadsvc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class UserLoginSvcController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/users", consumes = "application/json;charset=UTF-8", produces = {"application/json; charset=UTF-8"})
    @ResponseBody
    public User uploadFile(@RequestBody User user) {
        log.info("create user is started... {}", user);
        userRepository.save(user);
        log.info("create user is done.");
        return user;
    }

    @GetMapping(path = "/users", produces = {"application/json; charset=UTF-8"})
    public List<User> getUsers() {
        log.info("get users is started...");
        return (List<User>) userRepository.findAll();
    }


}
