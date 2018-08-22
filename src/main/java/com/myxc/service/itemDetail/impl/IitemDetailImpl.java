package com.myxc.service.itemDetail.impl;

import com.myxc.mapper.ItemDetailMapper;
import com.myxc.model.DataItem;
import com.myxc.model.ItemDetail;
import com.myxc.service.itemDetail.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by myxc on 2018/6/22.
 */
@Service
public class IitemDetailImpl implements ItemDetailService {


    @Autowired
    ItemDetailMapper itemDetailMapper;

    @Override
    public int addDataItem(ItemDetail itemDetail) {
        return itemDetailMapper.insert(itemDetail);
    }

    @Override
    public ItemDetail getDataItem(Integer itemId) {
        return itemDetailMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int updateItemDetail(ItemDetail itemDetail) {
        return itemDetailMapper.updateByPrimaryKeySelective(itemDetail);
    }
}
