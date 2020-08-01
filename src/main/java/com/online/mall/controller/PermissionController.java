package com.online.mall.controller;

import com.online.mall.dto.PermissionInfo;
import com.online.mall.service.PermissionService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PermissionController
 * @Create by Cai on 2020/7/30 18:43
 **/

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @ApiOperation("新增权限")
    @PostMapping("/create")
    @ResponseBody
    public ResponseResult<String> createPermission(@RequestBody PermissionInfo permissionInfo){
        if (permissionInfo.getName() == null){return CommonResult.failed("输入值有误");}
        if (permissionService.createPermission(permissionInfo)){
            return CommonResult.success("create permission success");
        }
        return  CommonResult.failed("create failed");


    }

    @PostMapping("/delete/{id}")
    public ResponseResult<String> deletePermission(@PathVariable Long id){
        if (id==null){return CommonResult.failed("id is nothing");}
        if(permissionService.deletePermission(id)){
            return CommonResult.success("delete permission success");
        }
        return CommonResult.failed("delete failed");
    }
}
