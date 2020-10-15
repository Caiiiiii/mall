package com.online.mall.service.serviceImpl;

import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.RolePermissionRelation;
import com.online.mall.mapper.RoleInfoMapper;
import com.online.mall.mapper.RolePermissionRelationMapper;
import com.online.mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName RoleServiceImpl
 * @Create by Cai on 2020/7/30 18:34
 **/

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Autowired
    private RolePermissionRelationMapper rolePermissionRelationMapper;


    @Override
    public boolean createRole(RoleInfo roleInfo) {
        try {
            if(findRoleByName(roleInfo.getName()) != null){
                return false;
            }
            roleInfo.setCreateTime(new Date());
            roleInfo.setStatus(1);
            roleInfoMapper.insert(roleInfo);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public RoleInfo findRoleByName(String name) {
        return roleInfoMapper.findRoleByName(name);
    }

    @Override
    public Integer deleteRole(Long roleId) {
         int count = roleInfoMapper.deleteByPrimaryKey(roleId);
           return count;
    }

    @Override
    public boolean updatePermission(Long roleId, List<Long> permissionIds) {
        try {
            rolePermissionRelationMapper.deleteAllByRoleId(roleId);
            for (long pId:permissionIds
                 ) {
                RolePermissionRelation rolePermissionRelation = new RolePermissionRelation();
                rolePermissionRelation.setRoleId(roleId);
                rolePermissionRelation.setPermissionId(pId);
                int count = rolePermissionRelationMapper.insert(rolePermissionRelation);
                if (count <1) return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<RoleInfo> selectAllRoles() {
        return  roleInfoMapper.selectAllRoles();
    }

    @Override
    public RoleInfo getRole(Long roleId) {
        return  roleInfoMapper.selectByPrimaryKey(roleId);
    }
}
