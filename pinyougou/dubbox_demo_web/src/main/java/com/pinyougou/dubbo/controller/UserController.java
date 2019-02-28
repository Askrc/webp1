package com.pinyougou.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author caiwen
 * @version 1.0
 * @date 2018-10-15
 * @describetion TODO
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("showName")
    @ResponseBody
    public String showName() {

        return userService.getName();

    }
}
