package com.fred.ycwl.common.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fred.ycwl.common.exception.BusinessException;
import com.fred.ycwl.common.web.ResponseCode;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/5/13 14:55
 */
public final class BeanCopyUtil {

    private BeanCopyUtil() {}

    /**
     * <b>Description:</b><br>
     * @param
     * @return
     * <b>Author:fred</b>
     * <br><b>Date:2019/5/13 14:55.</b>
     * <br><b>BackLog:</b>
     */
    public static <T> List<T> copyList(List<?> sourceList, Class<T> destClazz) {
        try {
            List<T> targetList = new ArrayList<>();
            for (Object tempObject : sourceList) {
                T t = destClazz.newInstance();
                BeanUtils.copyProperties(tempObject, t);
                targetList.add(t);
            }
            return targetList;
        } catch (Exception e) {
            throw new BusinessException(ResponseCode.ERROR_500, e);
        }
    }
}
