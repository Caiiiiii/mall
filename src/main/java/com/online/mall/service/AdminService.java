package com.online.mall.service;

import com.online.mall.dto.AdminInf;
import com.online.mall.dto.AdminLogin;
import com.online.mall.mapper.AdminLoginMapper;

public interface AdminService {
   AdminInf getAdminInfoByName(String name);


}
