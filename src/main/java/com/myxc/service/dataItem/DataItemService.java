package com.myxc.service.dataItem;

import com.myxc.model.DataItem;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * Created by myxc on 2018/6/15.
 */
public interface DataItemService {

    int addDataItem(DataItem dataItem);

    DataItem selectDataItem(Integer itemId);

    List<DataItem> selectAllDataItem();

    int updateByPrimaryKey(DataItem dataItem);

    int updateByPrimaryKeySelective(DataItem dataItem);

}
