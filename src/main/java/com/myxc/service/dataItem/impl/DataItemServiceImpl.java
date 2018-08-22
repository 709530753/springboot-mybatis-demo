package com.myxc.service.dataItem.impl;

import com.myxc.mapper.DataItemMapper;
import com.myxc.model.DataItem;
import com.myxc.service.dataItem.DataItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myxc on 2018/6/15.
 */
@Service(value = "dataItemService")
public class DataItemServiceImpl implements DataItemService{

    @Autowired
    DataItemMapper dataItemMapper;

    @Override
    public List<DataItem> selectAllDataItem() {
        return dataItemMapper.selectAllDataItem();
    }

    @Override
    public int updateByPrimaryKey(DataItem dataItem) {
        return dataItemMapper.updateByPrimaryKey(dataItem);
    }

    @Override
    public int updateByPrimaryKeySelective(DataItem dataItem) {
        return dataItemMapper.updateByPrimaryKeySelective(dataItem);
    }


    @Override
    public int addDataItem(DataItem dataItem) {
        return dataItemMapper.insert(dataItem);
    }

    @Override
    public DataItem selectDataItem(Integer itemId) {
        return dataItemMapper.selectDataItem(itemId);
    }
}
