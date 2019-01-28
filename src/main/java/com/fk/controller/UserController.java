package com.fk.controller;

import com.fk.service.IUserService;
import com.fk.vo.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Herdsric-2018-01 on 2019/1/24.
 */
@Controller
public class UserController {




    @Autowired
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/get")
    public userInfo getUser(userInfo user){
         return userService.getUserInfo();
    }



}
