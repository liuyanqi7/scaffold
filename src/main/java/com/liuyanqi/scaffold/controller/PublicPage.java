package com.liuyanqi.scaffold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PublicPage {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        map.put("name", "fanfan");
        return "web/hello";
    }

}
