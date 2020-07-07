package com.online.mall.utils.api;

public enum ResultCode {
    // 成功
    SUCCESS(200,"success"),

    // 失败
    FAIL(400,"fail"),

    // 未认证（签名错误）
    UNAUTHORIZED(401,"unauthorized"),

    // 接口不存在
    NOT_FOUND(404,"notFound"),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500,"serverError");

    public int code;
    public String msg;

    ResultCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}
