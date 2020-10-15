package com.online.mall.service;

import com.online.mall.dto.RoleInfo;

import java.util.List;

/**
 * @ClassName RoleService
 * @Create by Cai on 2020/7/30 18:33
 **/

public interface RoleService {
    boolean createRole(RoleInfo roleInfo);

    RoleInfo findRoleByName(String name);

    Integer deleteRole(Long roleId);

    boolean updatePermission(Long roleId, List<Long> permissionIds);

    List<RoleInfo> selectAllRoles();

    RoleInfo getRole(Long roleId);
}
