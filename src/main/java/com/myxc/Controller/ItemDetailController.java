package com.myxc.Controller;
import com.myxc.model.DataItem;
import com.myxc.model.ItemDetail;
import com.myxc.service.itemDetail.ItemDetailService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by myxc on 2018/6/22.
 */
@RestController
public class ItemDetailController {


    @Autowired
    private ItemDetailService itemDetailService;

    @RequestMapping("/addItemDetail")
    public int addItem(ItemDetail itemDetail) {
        return itemDetailService.addDataItem(itemDetail);
    }


    @RequestMapping("/updateItemDetail")
    public String updateItemDetail(ItemDetail itemDetail) {
        int result = itemDetailService.updateItemDetail(itemDetail);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (result == 1) {
            hashMap.put("data",itemDetail);
            hashMap.put("resultCode","200");
            hashMap.put("message","ok");
        } else  {
            hashMap.put("data","");
            hashMap.put("resultCode","509");
            hashMap.put("message","failure");
        }
        JSONObject jsonObject = JSONObject.fromObject(hashMap);
        return jsonObject.toString();
    }

        @RequestMapping("/serverstation/maintenanceItemDetail")
    public String getItemDetail(Integer opId) {

        ItemDetail itemDetail = itemDetailService.getDataItem(opId);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");
        hashMap.put("data",itemDetail);
        JSONObject jsonObject = JSONObject.fromObject(hashMap);
        return jsonObject.toString();

    }

}
