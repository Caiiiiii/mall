package com.online.mall.controller;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.param.AdminParam;
import com.online.mall.service.AdminService;
import com.online.mall.service.serviceImpl.AdminServiceImpl;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    
    @GetMapping("/hello")
    public ResponseResult<String> helloController(@RequestParam("name") String name){

        return CommonResult.success(name);
    }


    @ApiOperation("测试注册")
    @Transactional
    @PostMapping("/register")
    public ResponseResult<AdminInfo> register(@RequestBody AdminParam adminParam){

        AdminLogin adminLogin =  adminService.register(adminParam);
        if (adminLogin == null){
            return  CommonResult.failed();
        }
        return  CommonResult.success();
    }


}
