package com.online.mall.service.serviceImpl;

import com.online.mall.dto.PermissionInfo;
import com.online.mall.mapper.PermissionInfoMapper;
import com.online.mall.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName PermissionServiceImpl
 * @Create by Cai on 2020/7/30 18:47
 **/

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionInfoMapper permissionInfoMapper;


    @Override
    public boolean createPermission(PermissionInfo permissionInfo) {
        try{
            permissionInfo.setCreateTime(new Date());
            permissionInfo.setStatus(1);
            int count = permissionInfoMapper.insert(permissionInfo);
            if (count ==1){
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean deletePermission(Long id) {
        try {
            int count = permissionInfoMapper.deleteByPrimaryKey(id);
            if(count == 1){return true;}
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
