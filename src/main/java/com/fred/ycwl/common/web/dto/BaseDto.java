package com.fred.ycwl.common.web.dto;

import java.util.Date;

import lombok.Data;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/30 16:45
 */
@Data
public class BaseDto {

    private String creator;
    private String modifier;
    private Date createdTime;
    private Date modifiedTime;
    private Boolean isDeleted;
}
