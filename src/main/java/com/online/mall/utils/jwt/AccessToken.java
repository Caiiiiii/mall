package com.online.mall.utils.jwt;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName AccessToken
 * @Create by Cai on 2020/8/7 14:42
 **/

@Data
@Builder
public class AccessToken {
    private String loginAccount;
    private String token;
    private Date expirationTime;
}
