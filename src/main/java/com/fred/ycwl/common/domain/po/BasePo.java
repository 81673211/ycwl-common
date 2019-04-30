package com.fred.ycwl.common.domain.po;

import java.util.Date;

import lombok.Data;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2018/9/21 11:04
 */
@Data
public class BasePo {

    private String creator;

    private String modifier;

    private Date createdTime;

    private Date modifiedTime;

    private Boolean isDeleted;
}
