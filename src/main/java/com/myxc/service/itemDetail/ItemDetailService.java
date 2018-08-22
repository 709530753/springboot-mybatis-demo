package com.myxc.service.itemDetail;

import com.myxc.model.ItemDetail;

/**
 * Created by myxc on 2018/6/22.
 */

public interface ItemDetailService {

    int addDataItem(ItemDetail itemDetail);

    ItemDetail getDataItem(Integer itemId);

    int updateItemDetail(ItemDetail itemDetail);


}
