package com.online.mall.service.serviceImpl;

import com.online.mall.dto.AdminInfo;
import com.online.mall.dto.AdminLogin;
import com.online.mall.dto.AdminRoleRelation;
import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.param.AdminParam;
import com.online.mall.mapper.AdminInfoMapper;
import com.online.mall.mapper.AdminLoginMapper;
import com.online.mall.mapper.AdminRoleRelationMapper;
import com.online.mall.mapper.RolePermissionRelationMapper;
import com.online.mall.service.AdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;


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


    @Autowired
    private AdminRoleRelationMapper adminRoleRelationMapper;

    @Autowired
    private RolePermissionRelationMapper rolePermissionRelationMapper;

//    @Autowired
//    private AuthenticationManager authenticationManager;

//    @Autowired
//    private JWTUtil jwtProvider;

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
            adminLogin.setPassword(new BCryptPasswordEncoder().encode(adminLogin.getPassword()));
//        AdminLoginExample example = new AdminLoginExample();
//        example.createCriteria().andLoginNameEqualTo(adminLogin.getLoginName());

            //查找数据库是否有这个人
            if(findAdminByUserName(adminLogin.getLoginName()) != null){
                return null ;
            }
            int primaryLogin = adminLoginMapper.insert(adminLogin);

            //插入 AdminInfo 信息
            AdminInfo adminInfo = new AdminInfo();
            BeanUtils.copyProperties(adminParam,adminInfo);
            adminInfo.setAdminId(adminLogin.getAdminId());
            adminInfo.setModifiedTime(new Date());
            adminInfo.setRegisterTime(new Date());
            int primaryInfo = adminInfoMapper.insert(adminInfo);
            if (primaryLogin > 0 && primaryInfo > 0 ){
                return adminLogin;
            }
            return null;
        }catch (Exception e){
             e.printStackTrace();
        }
      return null;

    }



    @Transactional
    @Override
    public boolean updateRole(Long adminId, List<Long> roleIds) {
         try {
//             List<Integer> roleList = adminRoleRelationMapper.selectRoleListByAdminId(adminId);
             //加上事务，先全部删除再添加
             adminRoleRelationMapper.deleteByAdminId(adminId);
             for (long r: roleIds
                  ) {
                 AdminRoleRelation adminRoleRelation = new AdminRoleRelation();
                 adminRoleRelation.setAdminId(adminId);
                 adminRoleRelation.setRoleId(r);
                int count= adminRoleRelationMapper.insert(adminRoleRelation);
                if (count <1) return false;
             }
             return true;

         }catch (Exception e){
             e.printStackTrace();
         }
         return  false;
    }

    @Override
    public int delete(Integer id) {
      int count = adminLoginMapper.delete(id);
      return count;
    }

    @Override
    public List<RoleInfo> getRolesById(Integer id) {
        return     adminRoleRelationMapper.getRolesByAdminId(id);
    }



    @Override
    public RoleInfo getRoleById(Integer adminId) {
        return adminLoginMapper.getRoleByAdminId(adminId);
    }

//    @Override
//    public AccessToken login(AdminLoginParam adminLoginParam) {
//
//       // log.debug("进入login方法");
//        // 1 创建UsernamePasswordAuthenticationToken
//        UsernamePasswordAuthenticationToken usernameAuthentication =
//                new UsernamePasswordAuthenticationToken(adminLoginParam.getLoginName(), adminLoginParam.getPassword());
//        // 2 认证
//        Authentication authentication = this.authenticationManager.authenticate(usernameAuthentication);
//        // 3 保存认证信息
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        // 4 生成自定义token
//        AccessToken accessToken = jwtProvider.createToken((UserDetails) authentication.getPrincipal());
//
//        UserDetail userDetail = (UserDetail) authentication.getPrincipal();
//        // 放入缓存
//       // caffeineCache.put(CacheName.USER, userDetail.getUsername(), userDetail);
//        return accessToken;
//    }


}
