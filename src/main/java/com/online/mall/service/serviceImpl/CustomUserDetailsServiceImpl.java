package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.jwtParam.JwtUser;
import com.online.mall.service.AdminService;
import com.online.mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //  log.debug("开始登陆验证，用户名为: {}",s);

        // 根据用户名验证用户
        AdminLogin adminLogin = adminService.findAdminByUserName(username);
        if (adminLogin == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

      RoleInfo roleInfo = adminService.getRoleById(adminLogin.getAdminId());
       // List<RoleInfo> roleInfoList = adminService.getRolesById(adminLogin.getAdminId());
      //  userDetail.setRoleInfoList(roleInfoList);
        return new JwtUser(adminLogin,roleInfo);

//        AdminLogin adminLogin = adminLoginMapper.findAdminByUserName(username);
//
//            if (adminLogin == null) {
//                throw new UsernameNotFoundException("用户名不存在");
//            }
//
//        List<RoleInfo> roles = adminRoleRelationMapper.getRolesByAdminId(adminLogin.getAdminId());
//
//          //将所有的角色对应的资源权限全部放入user对应的grantedAuthority集合中
//        List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
//           for (RoleInfo role : roles) {
//               List<PermissionInfo> permissionInfos = rolePermissionRelationMapper.getPermissionByRoleId(role.getRoleId());
//               for (PermissionInfo p : permissionInfos) {
//                   if (p != null && p.getName() != null){
//                       SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(p.getName());
//                       grantedAuthorities.add(grantedAuthority);
//                    }
//               }
//           }
//
//      return new org.springframework.security.core.userdetails.User(
//              adminLogin.getLoginName()
//              ,adminLogin.getPassword()
//              ,grantedAuthorities);
    }
}
