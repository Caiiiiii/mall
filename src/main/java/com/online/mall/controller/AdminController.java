package com.online.mall.controller;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.param.AdminParam;
import com.online.mall.service.AdminService;
import com.online.mall.utils.api.CommonResult;
import com.online.mall.utils.api.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AdminController
 * @Create by Cai on 2020/7/7 16:04
 *
 * PostMan 请求注意事项：
 *  1.当Post请求使用RequestBody时，是raw方式请求，是请求一个对象，有且只有一个
 *  2.当Post请求使用RequestParam时，是form-data方法请求的，可以请求多个参数
 *     2.2 当Post请求使用RequestParam请求传List的时候，
 *          只需要多个key-value中key为@RequestParam对应的名字，value为值，比如：
 *           @RequestParam("names") List<String> names
 *           key   ---- value
 *           names ---- zhangsan
 *           names ---- lisi
 *           names ---- laowu
 *
 **/

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;



//    @ApiOperation("根据名字查找一个用户")
//    @GetMapping("/info")
//    public ResponseResult<AdminInfo> getAdminInfoByName(@RequestParam("name") @ApiParam("名字") String name){
//       try {
//           AdminInfo adminInfo = adminService.getAdminInfoByName(name);
//           return CommonResult.success(adminInfo);
//       }catch (Exception e){
//           return CommonResult.serverError(e.toString());
//       }
//    }


//    @ApiOperation("登录")
//    @Transactional
//    @PostMapping("/login")
//    public ResponseResult<AccessToken> login(@Valid @RequestBody  AdminLoginParam adminLoginParam){
//        return  CommonResult.success(adminService.login(adminLoginParam));
//
//    }




    @ApiOperation("注册")
    @Transactional
    @PostMapping("/users")
    public ResponseResult<AdminInfo> register(@RequestBody AdminParam adminParam){

        AdminLogin adminLogin =  adminService.register(adminParam);
        System.out.println("测试"+adminLogin);
        if (adminLogin == null){
            return  CommonResult.failed("返回NULL");
        }
        return  CommonResult.success();
    }

    @ApiOperation("删除")
    @Transactional
    @DeleteMapping("/users/{id}")
    public ResponseResult<AdminInfo> delete( @PathVariable Integer id){
        int count = adminService.delete(id);
        if(count > 0){
            return  CommonResult.success();
        }
        return CommonResult.failed();
    }



    @ApiOperation("更新角色")
    @PostMapping("/role/update")
    @ResponseBody
    public ResponseResult<String> updateRole(@RequestParam("adminId") Long adminId,
                                             @RequestParam("roleIds") List<Long> roleIds){

        if (adminId == null || roleIds.size()==0){
            return CommonResult.failed("Id或者roleIds不为空");
        }
        if(adminService.updateRole(adminId,roleIds)){
            return CommonResult.success("update role success! ");
        }
        return CommonResult.failed("update role failed");
    }

    @ApiOperation("获取该角色的所有权限")
    @PostMapping("/role/{id}}")
    @ResponseBody
    public ResponseResult<List<RoleInfo>> getRolesById(@PathVariable Integer id){
             List<RoleInfo> roleInfoList = adminService.getRolesById(id);
                 return CommonResult.success(roleInfoList);



    }




    


}
