package com.myxc.service.breakDown.impl;

import com.myxc.mapper.BreakDownItemMapper;
import com.myxc.model.BreakDownItem;
import com.myxc.service.breakDown.BreakDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myxc on 2018/12/6.
 */
@Service(value = "breakDownService")
public class BreakDownImpl implements BreakDownService {

    @Autowired
    BreakDownItemMapper itemMapper;

    @Override
    public List<BreakDownItem> selectAllItem() {
        return itemMapper.selectAllDataItem();
    }

    @Override
    public int insert(BreakDownItem record) {
        return itemMapper.insert(record);
    }
}
