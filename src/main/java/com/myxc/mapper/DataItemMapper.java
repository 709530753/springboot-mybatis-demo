package com.myxc.mapper;

import com.myxc.model.DataItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//@Mapper
public interface DataItemMapper {

    int deleteByPrimaryKey(Integer itemId);

    int insert(DataItem record);

    int insertSelective(DataItem record);

    DataItem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(DataItem record);

    int updateByPrimaryKey(DataItem record);

    List<DataItem> selectAllDataItem();

    DataItem selectDataItem(Integer itemId);
}