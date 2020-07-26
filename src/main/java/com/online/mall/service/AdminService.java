package com.online.mall.service;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.param.AdminParam;

public interface AdminService {
   AdminInfo getAdminInfoByName(String name);

   AdminLogin findAdminByUserName(String username);

   AdminLogin register(AdminParam adminParam);

}
