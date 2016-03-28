package com.kylo.demo.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * PackageName: com.example.demo.web
 * FileName: MainsiteErrorController.java
 * Description: TODO
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 *
 * @author wangzhang kylo.zw@gmail.com
 * @version 1.0, 16/3/28
 */
@Controller
public class MainsiteErrorController implements ErrorController {

    @RequestMapping("/error")
    public String error(Map<String, Object> model) {

        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
