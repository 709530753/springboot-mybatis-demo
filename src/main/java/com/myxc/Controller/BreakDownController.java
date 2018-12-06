package com.myxc.Controller;

import com.myxc.model.BreakDownItem;
import com.myxc.service.breakDown.BreakDownService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by myxc on 2018/12/5.
 */

@RestController
public class BreakDownController {

    @Autowired
    BreakDownService service;

    @RequestMapping("insertRecord")
    public String insertRecord(BreakDownItem item) {

        HashMap<String, Object> hashMap = new HashMap<>();

        int result = service.insert(item);

        if (result != 0) {
            hashMap.put("resultCode", 200);
            hashMap.put("message", "ok");
        } else  {
            hashMap.put("resultCode", 5.7);
            hashMap.put("message", "failure");
        }

        hashMap.put("data", item);

        JSONObject jsonObject = JSONObject.fromObject(hashMap);
        return jsonObject.toString();
    }

    @RequestMapping("queryServerstationFaultRecord")
    public String queryServerstationFaultRecord() {

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("resultCode", 200);
        hashMap.put("message", "ok");

        HashMap<String, Object> data = new HashMap<>();

        data.put("diagnosisTime", "2018-10-09 09:10:14");
        data.put("diagnosisCount", "5");

        List<BreakDownItem> breakDownItems = service.selectAllItem();

        data.put("list", breakDownItems);
        hashMap.put("data", data);

        JSONObject jsonObject = JSONObject.fromObject(hashMap);

        System.out.println("queryServerstationFaultRecord : " + jsonObject.toString());

        return jsonObject.toString();
    }

}
