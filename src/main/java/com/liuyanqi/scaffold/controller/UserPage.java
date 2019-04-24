package com.liuyanqi.scaffold.controller;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "定时任务" ,description = "用户接口")
public class UserPage {

    @GetMapping("/ceshi")
    @ApiOperation(value = "获取用户信息", notes = "通过用户姓名获取用户信息")
    public void ceshi(){
        System.out.println("ceshi");
    }
}
