package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.mapper.AdminInfoMapper;
import com.online.mall.mapper.AdminLoginMapper;
import com.online.mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AdminServiceImpl
 * @Create by Cai on 2020/7/7 15:42
 **/
@Service
public class AdminServiceImpl implements AdminService, UserDetailsService {

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminLogin adminLogin = adminLoginMapper.findAdminByUserName(username);

            if (adminLogin == null) {
                throw new UsernameNotFoundException("用户名不存在");
            }
//            List<SysRole> roles = user.getRoles();
//
//            //将所有的角色对应的资源权限全部放入user对应的grantedAuthority集合中
//            for (SysRole role : roles) {
//                List<SysResource> resources = role.getResources();
//                List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//                for (SysResource resource : resources) {
//                    if (resource != null && resource.getResourceName()!=null) {
//                        GrantedAuthority grantedAuthority = new UrlGrantedAuthority(resource.getMethodPath(),resource.getResourceName());
//                        grantedAuthorities.add(grantedAuthority);
//                    }
//                }
//                user.setGrantedAuthority(grantedAuthorities);
//            }
//
//            System.out.println("s:" + username);
//            return user;
//        }
        return null;
    }
}
