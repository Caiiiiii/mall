package com.online.mall.controller;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.service.AdminService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
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
    
    @PostMapping("/hello")
    public ResponseResult<String> helloController(@RequestParam("name") String name){

        return CommonResult.success(name);
    }

    @ApiOperation("测试注册")
    @Transactional
    @PostMapping("/register")
    public ResponseResult<AdminInfo> register(
            @RequestParam("username") @ApiParam("账号") String username,
            @RequestParam("password") @ApiParam("密码") String password,
            @RequestParam("name") @ApiParam("昵称") String name){
        AdminLogin adminLogin = adminService.findAdminByUserName(username);
        if (adminLogin == null){
            AdminLogin newAdminLogin = new AdminLogin();
            newAdminLogin.setLoginName(username);
            newAdminLogin.setPassword(password);

            AdminInfo newAdminInfo = new AdminInfo();
            newAdminInfo.setAdminName(name);
            int returnCode = adminService.register(newAdminInfo,newAdminLogin);
            return CommonResult.success("return Id:"+returnCode);


        }
        return  CommonResult.failed("该账号已被使用");
    }


}
