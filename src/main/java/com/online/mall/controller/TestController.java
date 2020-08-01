package com.online.mall.controller;

import com.online.mall.service.AdminService;
import com.online.mall.service.serviceImpl.AdminServiceImpl;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName testController
 * @Create by Cai on 2020/7/7 12:17
 **/
@RestController

public class TestController {

 @Autowired
 private AdminService adminService;

 @Autowired
 private AdminServiceImpl adminServiceImpl;

    
    @GetMapping("/vi")
    public ResponseResult<String> helloController(@RequestParam("name") String name){

        return CommonResult.success(name);
    }








}
