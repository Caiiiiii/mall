package com.online.mall.service;

import com.online.mall.dto.PermissionInfo;

public interface PermissionService {
    boolean createPermission(PermissionInfo permissionInfo);

    boolean deletePermission(Long id);
}
