package com.online.mall.dto.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AdminLoginParam {

    @NotBlank(message = "登陆用户名为空")
    private String loginName;

    @NotBlank(message = "登陆密码为空")
    private String password;
}
