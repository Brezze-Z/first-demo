package com.auguest.study.demo.controller;

import com.auguest.study.demo.service.impl.FlowerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/flower")
public class FlowerController {

    @Autowired
    private FlowerServiceImpl flowerService;

    @RequestMapping(value = "/page")
    public String getFlowerIndex(){
        System.out.println("已经访问到了该方法");
        return "index";
    }

    @ResponseBody
    @GetMapping("/index2")
    public String getFlowerById(Integer id){

        System.out.println("!!!!!!!!!!!!!!!!!!!!!");

       return flowerService.getFlowerById(id).toString();

    }

}
