package com.online.mall.controller;

import com.online.mall.dto.AdminInf;
import com.online.mall.service.AdminService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Create by Cai on 2020/7/7 16:04
 **/

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/info")
    public ResponseResult<AdminInf> getAdminInfoByName(@RequestParam("name") String name){
       try {
           AdminInf adminInf = adminService.getAdminInfoByName(name);
           return CommonResult.success(adminInf);
       }catch (Exception e){
           return CommonResult.serverError(e.toString());
       }
    }
}
