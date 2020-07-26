package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.param.AdminParam;
import com.online.mall.mapper.AdminInfoMapper;
import com.online.mall.mapper.AdminLoginMapper;
import com.online.mall.service.AdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;


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
    public AdminLogin register(AdminParam adminParam) {
        try{
            AdminLogin adminLogin = new AdminLogin();
            BeanUtils.copyProperties(adminParam,adminLogin);
            adminLogin.setUserStats((byte) 1);
            adminLogin.setModifiedTime(new Date());
//        AdminLoginExample example = new AdminLoginExample();
//        example.createCriteria().andLoginNameEqualTo(adminLogin.getLoginName());

            //查找数据库是否有这个人
            if(findAdminByUserName(adminLogin.getLoginName()) != null){
                return null ;
            }
            int primary = adminLoginMapper.insert(adminLogin);

            //插入 AdminInfo 信息
            AdminInfo adminInfo = new AdminInfo();
            BeanUtils.copyProperties(adminParam,adminInfo);
            adminInfo.setAdminId(adminLogin.getAdminId());
            adminInfo.setModifiedTime(new Date());
            adminInfo.setRegisterTime(new Date());
            adminInfoMapper.insert(adminInfo);
            return adminLogin;
        }catch (Exception e){
             e.printStackTrace();
        }
        return  null;

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
