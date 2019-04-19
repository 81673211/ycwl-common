package com.fred.ycwl.common.web;

import java.io.Serializable;

import lombok.Data;

/**
 * 
* <b>dubbo接口,统一返回封装类:</b><br> 
* @author <b>fryu</b>
* <br><b>ClassName:</b> Response
* <br><b>Date:</b> 2017年7月3日 下午5:49:44.
 */
@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 740035226710288225L;

    /**
     * 返回结果.
     */

    private T data;

    private String code;

    private String message;

    private boolean success;

    private long ts = System.currentTimeMillis();

    /**
     * 
     * <b>Description:返回对象.</b><br> 
     * @param isSuccess 是否成功
     * @param code 错误码
     * @param data 数据
     */
    public Response(boolean isSuccess, ResponseCode code, T data) {
        setCode(isSuccess ? ResponseCode.SUCCESS_200.getCode() : code.getCode());
        setMessage(isSuccess ? "调用成功" : code.getDesc());
        this.data = data;
    }

    /**
     * 
     * <b>Description:返回对象.</b><br> 
     * @param isSuccess 是否成功
     * @param code 错误码
     * @param desc 描述
     * @param data 数据
     */
    public Response(boolean isSuccess, String code, String desc, T data) {
        setCode(isSuccess ? ResponseCode.SUCCESS_200.getCode() : code);
        setMessage(isSuccess ? "调用成功" : desc);
        this.data = data;
    }

    public Response() {}

    public boolean isSuccess() {
        return ResponseCode.SUCCESS_200.getCode().equals(getCode());
    }

    public static <T> Response<T> getSuccess(T object) {
        return new Response<>(true, ResponseCode.SUCCESS_200, object);
    }

    public static <T> Response<T> getFailed(ResponseCode responseCode, T object) {
        return new Response<>(false, responseCode, object);
    }
}
