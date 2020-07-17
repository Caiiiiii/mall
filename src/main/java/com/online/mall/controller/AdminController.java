package com.online.mall.controller;

import com.online.mall.dto.AdminInfo;
import com.online.mall.service.AdminService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AdminController
 * @Create by Cai on 2020/7/7 16:04
 **/

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ApiOperation("根据名字查找一个用户")
    @GetMapping("/info")
    public ResponseResult<AdminInfo> getAdminInfoByName(@RequestParam("name") @ApiParam("名字") String name){
       try {
           AdminInfo adminInfo = adminService.getAdminInfoByName(name);
           return CommonResult.success(adminInfo);
       }catch (Exception e){
           return CommonResult.serverError(e.toString());
       }
    }

//    @PostMapping("/register")
//    public ResponseResult<AdminInfo> register(@RequestBody )
}
