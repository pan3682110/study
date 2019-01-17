package com.fengpan.study.demo.controller;


import com.fengpan.study.demo.dao.UserDao;
import com.fengpan.study.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserDao userDao;

    @PostMapping("/getUser")
    public User get() {
        return userDao.getUser();

    }
}
