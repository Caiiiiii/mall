package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminInf;
import com.online.mall.mapper.AdminInfMapper;
import com.online.mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AdminServiceImpl
 * @Create by Cai on 2020/7/7 15:42
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminInfMapper adminInfMapper;

    @Override
    public AdminInf getAdminInfoByName(String name) {
        AdminInf adminInf = adminInfMapper.selectByName(name);
        return adminInf;
    }
}
