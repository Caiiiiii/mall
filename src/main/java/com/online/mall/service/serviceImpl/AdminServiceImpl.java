package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminInfoExample;
import com.online.mall.dto.AdminLogin;
import com.online.mall.mapper.AdminInfoMapper;
import com.online.mall.mapper.AdminLoginMapper;
import com.online.mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AdminServiceImpl
 * @Create by Cai on 2020/7/7 15:42
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminInfoMapper adminInfoMapper;

    @Autowired
    private AdminLoginMapper adminLoginMapper;

    @Override
    public AdminInfo getAdminInfoByName(String name) {
        AdminInfo adminInfo = adminInfoMapper.selectByName(name);
        return adminInfo;
    }

    @Override
    public AdminLogin findAdminByUserName(String username) {
        return adminLoginMapper.findAdminByUserName(username);
    }

    @Transactional
    @Override
    public int register(AdminInfo adminInfo, AdminLogin adminLogin) {
        int adminLoginId = adminLoginMapper.insert(adminLogin);
        adminInfo.setAdminId(adminLoginId);
        int adminInfoId = adminInfoMapper.insert(adminInfo);
        return adminInfoId;
    }
}
