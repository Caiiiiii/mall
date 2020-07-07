package com.online.mall.controller;

import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName testController
 * @Create by Cai on 2020/7/7 12:17
 **/
@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/hello")
    public ResponseResult<String> helloController(){

        return CommonResult.success();
    }
}
