package com.myxc.mapper;

import com.myxc.model.ServiceActiveItem;

import java.util.List;

public interface ServiceActiveItemMapper {

    int deleteByPrimaryKey(Integer itemId);

    int insert(ServiceActiveItem record);

    int insertSelective(ServiceActiveItem record);

    ServiceActiveItem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(ServiceActiveItem record);

    int updateByPrimaryKey(ServiceActiveItem record);

    List<ServiceActiveItem> selectAllItems();

}