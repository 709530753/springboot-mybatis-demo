package com.myxc.service.serviceActiveItem;

import com.myxc.model.DataItem;
import com.myxc.model.ServiceActiveItem;

import java.util.List;

/**
 * Created by myxc on 2018/8/22.
 */
public interface ServiceActiveItemService {

    ServiceActiveItem selectServiceActiveItem(Integer itemId);

    int updateByPrimaryKeySelective(ServiceActiveItem item);

    int insertItem(ServiceActiveItem item);

    List<ServiceActiveItem> findAllServiceActiveItem();

}
