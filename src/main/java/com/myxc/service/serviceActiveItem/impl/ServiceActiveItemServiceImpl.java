package com.myxc.service.serviceActiveItem.impl;

import com.github.pagehelper.PageHelper;
import com.myxc.mapper.ServiceActiveItemMapper;
import com.myxc.mapper.UserMapper;
import com.myxc.model.ServiceActiveItem;
import com.myxc.service.serviceActiveItem.ServiceActiveItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myxc on 2018/8/22.
 */

@Service
public class ServiceActiveItemServiceImpl implements ServiceActiveItemService {


    @Autowired
    private ServiceActiveItemMapper itemMapper;//这里会报错，但是并不会影响

    @Override
    public ServiceActiveItem selectServiceActiveItem(Integer itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceActiveItem item) {
        return itemMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public int insertItem(ServiceActiveItem item) {
        return itemMapper.insert(item);
    }

    @Override
    public List<ServiceActiveItem> findAllServiceActiveItem() {
        return itemMapper.selectAllItems();
    }
}
