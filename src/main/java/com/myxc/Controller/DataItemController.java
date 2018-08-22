package com.myxc.Controller;

import com.myxc.model.DataItem;
import com.myxc.service.dataItem.DataItemService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

/**
 * Created by myxc on 2018/6/15.
 */
@RestController
public class DataItemController {

    @Autowired
    DataItemService dataItemService;

    @RequestMapping("/serverstation/queryMaintenanceItem")
    public String queryMaintenanceItem() {

        List<DataItem> dataItems = dataItemService.selectAllDataItem();

        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");

        HashMap<String,Object> dataHashMap = new HashMap<>();
        dataHashMap.put("list",dataItems);
        hashMap.put("data",dataHashMap);

        JSONObject jsonObject = JSONObject.fromObject(hashMap);

        return jsonObject.toString();
    }

    @RequestMapping("/getItem")
    public String getItem(Integer itemId){
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");

        DataItem dataItem = dataItemService.selectDataItem(itemId);

        if (dataItem != null) {
            hashMap.put("data",dataItem);
        } else {
            hashMap.put("data","");
        }
        return JSONObject.fromObject(hashMap).toString();
    }

    @RequestMapping("/updateByPrimaryKeySelective")
    public String updateByPrimaryKeySelective(DataItem dataItem) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");

        int result = dataItemService.updateByPrimaryKeySelective(dataItem);

        if (result == 1) {
            hashMap.put("data",dataItem);
        } else {
            hashMap.put("data","");
        }
        return JSONObject.fromObject(hashMap).toString();
    }

//    http://localhost:9527/updateitem?itemId=2&repairItemName="rfiutn"&opId="fnrtn"
    @RequestMapping("/updateByPrimaryKey")
    public String updateByPrimaryKey(DataItem dataItem) {

        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("resultCode","200");
        hashMap.put("message","ok");

        int result = dataItemService.updateByPrimaryKey(dataItem);

        if (result == 1) {
            hashMap.put("data",dataItem);
        } else {
            hashMap.put("data","");
        }
        return JSONObject.fromObject(hashMap).toString();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/addItem")
    public String addDataItem(DataItem dataItem) {

        HashMap<String,Object> hashMap = new HashMap<>();

        if (dataItem.getItemId() != null && dataItem.getItemId() != 0) {
            DataItem dataItem1 = dataItemService.selectDataItem(dataItem.getItemId());

            if (dataItem1 != null) {
                hashMap.put("data","");
                hashMap.put("code",0);
                hashMap.put("msg","failure");
            }  else  {
                int result = dataItemService.addDataItem(dataItem);
                hashMap.put("data",JSONObject.fromObject(dataItem));
                hashMap.put("code",result);
                hashMap.put("msg",result==1?"success":"failure");
            }

        } else {
            int result = dataItemService.addDataItem(dataItem);
            hashMap.put("data",JSONObject.fromObject(dataItem));
            hashMap.put("code",result);
            hashMap.put("msg",result==1?"success":"failure");
        }

        JSONObject jsonObject = JSONObject.fromObject(hashMap);

        return jsonObject.toString();
    }

}
