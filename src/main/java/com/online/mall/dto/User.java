package com.online.mall.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @ClassName User
 * @Create by Cai on 2020/7/31 17:43
 **/

public class User implements UserDetails {

    private final Integer id;
    //帐号,这里是我数据库里的字段
    private final String loginName;
    //密码
    private final String password;
    //角色集合
    private final Collection<? extends GrantedAuthority>authorities;

    public User(Integer id, String loginName, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.authorities = authorities;
    }

    //返回分配给用户的角色列表
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    public Integer getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    //虽然我数据库里的字段是 `account`  ,这里还是要写成 `getUsername()`,因为是继承的接口
    @Override
    public String getUsername() {
        return loginName;
    }
    // 账户是否未过期
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    // 账户是否未锁定
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    // 密码是否未过期
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    // 账户是否激活
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
