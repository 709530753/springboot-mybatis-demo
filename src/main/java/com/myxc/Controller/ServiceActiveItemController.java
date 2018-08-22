package com.myxc.Controller;

import com.myxc.model.ServiceActiveItem;
import com.myxc.service.serviceActiveItem.ServiceActiveItemService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
public class ServiceActiveItemController {

    @Autowired
    ServiceActiveItemService activeItemService;

    @RequestMapping("/serverstation/queryServiceActiveItem")
    public String queryMaintenanceItem() {

        List<ServiceActiveItem> serviceActiveItems = activeItemService.findAllServiceActiveItem();

        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");

        HashMap<String,Object> dataHashMap = new HashMap<>();
        dataHashMap.put("list",serviceActiveItems);
        hashMap.put("data",dataHashMap);

        JSONObject jsonObject = JSONObject.fromObject(hashMap);

        return jsonObject.toString();
    }

    @RequestMapping("/serverstation/addServiceActiveItem")
    public  String addServiceActiveItem(ServiceActiveItem dataItem) {

        HashMap<String,Object> hashMap = new HashMap<>();

        if (dataItem.getItemId() != null && dataItem.getItemId() != 0) {
            ServiceActiveItem dataItem1 = activeItemService.selectServiceActiveItem(dataItem.getItemId());
            if (dataItem1 != null) {
                if (dataItem.getActiveId() != null) {
                    dataItem1.setActiveId(dataItem.getActiveId());
                }

                if (dataItem.getActiveCode() != null) {
                    dataItem1.setActiveCode(dataItem.getActiveCode());
                }

                if (dataItem.getActiveName() != null) {
                    dataItem1.setActiveName(dataItem.getActiveName());
                }

                if (dataItem.getActiveComment() != null) {
                    dataItem1.setActiveComment(dataItem.getActiveComment());
                }

                if (dataItem.getWoCode() != null) {
                    dataItem1.setWoCode(dataItem.getWoCode());
                }

                if (dataItem.getStatus() != null) {
                    dataItem1.setStatus(dataItem.getStatus());
                }

                if (dataItem.getOpId() != null) {
                    dataItem1.setOpId(dataItem.getOpId());
                }

                int result = activeItemService.updateByPrimaryKeySelective(dataItem1);
                hashMap.put("data",JSONObject.fromObject(dataItem1));
                hashMap.put("resultCode",result==1?200:0);
                hashMap.put("message",result==1?"success":"failure");
            }  else  {
                int result = activeItemService.insertItem(dataItem);
                hashMap.put("data",JSONObject.fromObject(dataItem));
                hashMap.put("resultCode",result==1?200:0);
                hashMap.put("message",result==1?"success":"failure");
            }

        } else {
            int result = activeItemService.insertItem(dataItem);
            hashMap.put("data",JSONObject.fromObject(dataItem));
            hashMap.put("resultCode",result==1?200:0);
            hashMap.put("message",result==1?"success":"failure");
        }

        JSONObject jsonObject = JSONObject.fromObject(hashMap);

        return jsonObject.toString();
    }

}