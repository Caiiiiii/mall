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

    @ApiOperation("获取所有角色")
    @GetMapping("")
    @ResponseBody
    public  ResponseResult<List<RoleInfo>> selectAllRoles(){
       List<RoleInfo> roleInfoList = roleService.selectAllRoles();
       return CommonResult.success(roleInfoList);
    }

    @ApiOperation("获取对应角色")
    @GetMapping("/{roleId}")
    @ResponseBody
    public  ResponseResult<RoleInfo> selectRole(@PathVariable Long roleId){
        RoleInfo roleInfo = roleService.getRole(roleId);
        return CommonResult.success(roleInfo);
    }


    @ApiOperation("新增角色")
    @PostMapping("")
    public ResponseResult<String> createRole(@RequestBody RoleInfo roleInfo){
        if(roleInfo.getName() == null){return CommonResult.failed("Request is nothing");}

        if (roleService.createRole(roleInfo)){
            return CommonResult.success("create this role success!");
        }
        return CommonResult.failed("already had this role");
    }

    @ApiOperation("删除角色")
    @DeleteMapping("/{roleId}")
    @ResponseBody
    public ResponseResult<String> deleteRole(@PathVariable Long roleId){

        if(roleId == 0){return  CommonResult.failed("Request is nothing");}

        if (roleService.deleteRole(roleId) > 0){
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
