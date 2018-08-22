package com.myxc.mapper;

import com.myxc.model.ItemDetail;

public interface ItemDetailMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(ItemDetail record);

    int insertSelective(ItemDetail record);

    ItemDetail selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(ItemDetail record);

    int updateByPrimaryKey(ItemDetail record);
}