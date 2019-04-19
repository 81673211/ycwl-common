package com.fred.ycwl.common.web;

import java.io.Serializable;

import lombok.Data;

/**
 * <b>Description:</b><br>
 * <b>Author:fred</b>
 * <br><b>Date:2019/4/19 14:07.</b>
 * <br><b>BackLog:</b>
 */
@Data
public class ResponseCode implements Serializable {

    public static final ResponseCode SUCCESS_200 = new ResponseCode("200", "处理成功");
    public static final ResponseCode ERROR_400 = new ResponseCode("400", "请求参数错误");
    public static final ResponseCode ERROR_401 = new ResponseCode("401", "请求未提交用户认证");
    public static final ResponseCode ERROR_402 = new ResponseCode("402", "自定义错误码");
    public static final ResponseCode ERROR_403 = new ResponseCode("403", "请求被拒绝执行，多数是因为权限不够");
    public static final ResponseCode ERROR_404 = new ResponseCode("404", "资源未找到");
    public static final ResponseCode ERROR_408 = new ResponseCode("408", "请求超时");
    public static final ResponseCode ERROR_500 = new ResponseCode("500", "服务器错误，通常是运行时错误");
    public static final ResponseCode ERROR_501 = new ResponseCode("501", "服务器不支持当前请求的某些功能");
    public static final ResponseCode ERROR_502 = new ResponseCode("502", "错误或者无效网关");

    private static final long serialVersionUID = 126348711987713329L;

    private String code;

    private String desc;

    /**
     * 
     * <b>Description:返回Code.</b><br> 
     * @param code 编码
     * @param desc 描述
     */
    public ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
