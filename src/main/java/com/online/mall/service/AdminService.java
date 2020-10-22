package com.online.mall.service;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.param.AdminParam;

import java.util.List;

public interface AdminService {
   AdminInfo getAdminInfoByName(String name);

   AdminLogin findAdminByUserName(String username);

   AdminLogin register(AdminParam adminParam);



   boolean updateRole(Long adminId, List<Long> roleIds);

    int delete(Integer id);

    List<RoleInfo> getRolesById(Integer id);

   // AccessToken login(AdminLoginParam adminLoginParam);

    RoleInfo getRoleById(Integer adminId);
}
