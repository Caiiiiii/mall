package com.online.mall.utils.api;

/**
 * @ClassName CommonResult
 * @Create by Cai on 2020/7/7 11:58
 **/

public class CommonResult {
    private final static String SUCCESS = "success";

    private final static String FAIL = "fail";

    public static <T> ResponseResult<T> success() {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS.code).setMsg(ResultCode.SUCCESS.msg);
    }

    public static <T> ResponseResult<T> success(String message) {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS.code).setMsg(message);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS.code).setMsg(ResultCode.SUCCESS.msg).setData(data);
    }

    public static <T> ResponseResult<T> failed() {
        return new ResponseResult<T>().setCode(ResultCode.FAIL.code).setMsg(ResultCode.FAIL.msg);
    }

    public static <T> ResponseResult<T> failed(String message) {
        return new ResponseResult<T>().setCode(ResultCode.FAIL.code).setMsg(message);
    }

    public static <T> ResponseResult<T> failed(T data) {
        return new ResponseResult<T>().setCode(ResultCode.FAIL.code).setMsg(ResultCode.FAIL.msg).setData(data);
    }

    public static <T> ResponseResult<T> serverError(T data) {
        return new ResponseResult<T>().setCode(ResultCode.INTERNAL_SERVER_ERROR.code).setMsg(ResultCode.INTERNAL_SERVER_ERROR.msg).setData(data);
    }

    public static <T> ResponseResult<T> makeRsp(int code, String msg) {
        return new ResponseResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> ResponseResult<T> makeRsp(int code, String msg, T data) {
        return new ResponseResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
