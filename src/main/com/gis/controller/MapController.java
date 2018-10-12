package com.gis.controller;

import com.gis.db.model.Marks;
import com.gis.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
/**
 * Created by QXY on 2018/10/6.
 */
@Controller
@RequestMapping("map")
public class MapController {


    @RequestMapping("/map")
    public String login(){
        return "map";
    }


    @Autowired
    MarksService marksService;

    @RequestMapping(value = "/getmarks.action", produces = {"application/json;charset=UTF-8"})  //...自己填
    @ResponseBody
    public String getMarks(@RequestBody String[] array) throws IOException {
//        Map<String,String> map = new HashMap<String, String>();
//
//        if(array[0]!=null&&!"".equals(array[0]))
//            map.put("family",array[0]);
//        else
//            map.put("family",null);
//        if(array[1]!=null&&!"".equals(array[1]))
//            map.put("grouper",array[1]);
//        else
//            map.put("grouper",null);
//        if(array[2]!=null&&!"".equals(array[2]))
//            map.put("branch",array[2]);
//        else
//            map.put("branch",null);
//        if(array[3]!=null&&!"".equals(array[3]))
//            map.put("languager",array[3]);
//        else
//            map.put("languager",null);

        List<Marks> marks = marksService.getMarks();
        return JSON.toJSONString(marks);
    }

}
