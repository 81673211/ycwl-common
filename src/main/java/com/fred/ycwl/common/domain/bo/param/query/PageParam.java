package com.fred.ycwl.common.domain.bo.param.query;

import com.fred.ycwl.common.domain.bo.param.BaseParam;

import lombok.Data;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2018/11/9 13:24
 */
@Data
public class PageParam extends BaseParam {

    private int curPage = 1;

    private int pageSize = 10;
}
