package com.auguest.study.demo.controller;

import com.auguest.study.demo.dao.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    // 如何让Spring加载到数据对象当中。 --》 封装局部数据。
    /*
     *
     * 1. 创建类，用于给类添加相关的属性。
     * 2. 在配置文件中配置属性。
     * */


    // Enverment 对象封装对象实例信息。
    @Autowired
    private Environment environment;

    /*
    * Rest风格代码实例
    * */
    @RequestMapping(method = RequestMethod.POST,name = "/index",path = "/index")
    public String getIndexSave(){
        return "{这是一个保存方法}";
    }

    @RequestMapping(method = RequestMethod.GET,name = "/index",path = "/index")
    public String getIndexSel(){
        System.out.println("This is a Query methods");
        return "{这是一个查询方法}";
    }




}
