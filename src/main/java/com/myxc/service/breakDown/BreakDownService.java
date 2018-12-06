package com.myxc.service.breakDown;

import com.myxc.model.BreakDownItem;

import java.util.List;

/**
 * Created by myxc on 2018/12/6.
 */
public interface BreakDownService {

    int insert(BreakDownItem record);

    List<BreakDownItem> selectAllItem();

}
