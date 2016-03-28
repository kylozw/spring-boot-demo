package com.kylo.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * PackageName: com.example.web
 * FileName: HelloController.java
 * Description: TODO
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 *
 * @author wangzhang kylo.zw@gmail.com
 * @version 1.0, 16/3/25
 */
@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/index")
    public String index(Map<String, Object> model) {
        List<String> l = new ArrayList<>();
        l.add("哈喽，hadoop");
        l.add("哈喽，hbase");
        l.add("哈喽，hive");
        l.add("哈喽，pig");
        l.add("哈喽，zookeeper");
        l.add("哈喽，三劫散仙");
        //将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data",l);

        logger.info("halo~");

        return "index";
    }

}