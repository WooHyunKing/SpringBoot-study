package com.shop.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value="/productlist",method= RequestMethod.GET)
    public String productList(){
//        System.out.println(id);
//        return "Hello World";
        JsonObject obj1=new JsonObject();
        obj1.addProperty("item_nm","수제 햄버거");
        obj1.addProperty("item_detail","소고기 패티와 토마토가 들어 있는 햄버거");
        obj1.addProperty("item_reg_date","2022/04/22");
        obj1.addProperty("item_price","4000");

        JsonObject obj2=new JsonObject();
        obj2.addProperty("item_nm","카레라이스");
        obj2.addProperty("item_detail","매운 3분 카레라이스");
        obj2.addProperty("item_reg_date","2022/03/10");
        obj2.addProperty("item_price","8000");

        JsonObject obj3=new JsonObject();
        obj3.addProperty("item_nm","라면");
        obj3.addProperty("item_detail","소고기 라면");
        obj3.addProperty("item_reg_date","2021/09/10");
        obj3.addProperty("item_price","1500");

        JsonArray infoArray=new JsonArray();
        infoArray.add(obj1);
        infoArray.add(obj2);
        infoArray.add(obj3);

//        obj.addProperty("title","신사와 아가씨");
//        obj.addProperty("content","로맨틱 코메디");
//
//        JsonObject data=new JsonObject();
//        data.addProperty("time","토일 8시");
//        obj.add("data",data);

        return infoArray.toString();
    }
}
