package com.online.mall.config.logHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionHandler {

    //日志对象
    private static final Logger logger = LoggerFactory.getLogger("log4j.properties");

//    /**
//     * 异常处理
//     * @param request
//     * @param exception
//     * @return
//     * @throws Exception
//     */
//    @org.springframework.web.bind.annotation.ExceptionHandler
//    public ResponseResult<String> allExceptionHandler(HttpServletRequest request,
//                                              Exception exception) throws Exception{
//        String contextPath = request.getContextPath();
//
//        //将异常对象写入日志内
//        logger.error(exception.getMessage(), exception);
//        //返回异常信息, 直接返回给客户端
//        return  CommonResult.failed("");
//    }
}
