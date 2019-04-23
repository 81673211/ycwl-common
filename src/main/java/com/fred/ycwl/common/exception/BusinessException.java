package com.fred.ycwl.common.exception;

import com.fred.ycwl.common.web.ResponseCode;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/22 17:02
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 223708861468025962L;

    private ResponseCode responseCode;

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public BusinessException(ResponseCode responseCode) {
        super(responseCode.getDesc());
        this.responseCode = responseCode;
    }

    public BusinessException(ResponseCode responseCode, Throwable throwable) {
        super(responseCode.getDesc(), throwable);
        this.responseCode = responseCode;
    }

}
