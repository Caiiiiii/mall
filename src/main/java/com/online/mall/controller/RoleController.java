package com.online.mall.controller;

import com.online.mall.dto.RoleInfo;
import com.online.mall.service.RoleService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName RoleController
 * @Create by Cai on 2020/7/30 15:13
 **/

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;





    @ApiOperation("新增角色")
    @PostMapping("/create")
    public ResponseResult<String> createRole(@RequestBody RoleInfo roleInfo){
        if(roleInfo.getName() == null){return CommonResult.failed("Request is nothing");}

        if (roleService.createRole(roleInfo)){
            return CommonResult.success("create this role success!");
        }
        return CommonResult.failed("already had this role");
    }

    @ApiOperation("删除角色")
    @PostMapping("/delete/{roleId}")
    @ResponseBody
    public ResponseResult<Long> deleteRole(@PathVariable Long roleId){

        if(roleId == 0){return  CommonResult.failed("Request is nothing");}

        if (roleService.deleteRole(roleId)){
            return CommonResult.success("delete role success!");
        }
        return  CommonResult.failed("there is not this roleId");
    }

    @ApiOperation("更新权限")
    @PostMapping("/permission/update")
    @ResponseBody
    public ResponseResult<String> updatePermission(@RequestParam("roleId") Long roleId,
                                                   @RequestParam("permissionId") List<Long> permissionIds){
        if ( roleId == null || permissionIds.size() == 0){
            return  CommonResult.failed("roleId 或 permissionId 不能为空");
        }
        if(roleService.updatePermission(roleId,permissionIds)){
            return CommonResult.success("update permission success");
        }
        return CommonResult.failed("update permission failed");
    }
}
