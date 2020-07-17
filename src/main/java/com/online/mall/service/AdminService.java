package com.online.mall.service;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;

public interface AdminService {
   AdminInfo getAdminInfoByName(String name);

   AdminLogin findAdminByUserName(String username);

   int register(AdminInfo adminInfo,AdminLogin adminLogin);

}
