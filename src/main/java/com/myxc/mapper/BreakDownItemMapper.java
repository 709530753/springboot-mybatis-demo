package com.myxc.mapper;

import com.myxc.model.BreakDownItem;
import com.myxc.model.DataItem;

import java.util.List;

public interface BreakDownItemMapper {
    int deleteByPrimaryKey(Integer spnId);

    int insert(BreakDownItem record);

    int insertSelective(BreakDownItem record);

    BreakDownItem selectByPrimaryKey(Integer spnId);

    List<BreakDownItem> selectAllDataItem();

    int updateByPrimaryKeySelective(BreakDownItem record);

    int updateByPrimaryKey(BreakDownItem record);
}