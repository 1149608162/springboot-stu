package com.yuan.controller;

import com.yuan.config.WXConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("freemaker")
public class FreemakerController {

    @Autowired
    private WXConfig wxConfig;

    @GetMapping("test")
    public String index(ModelMap modelMap) {


        modelMap.addAttribute("setting", wxConfig);

        // 不需要加后缀，配置文件里面已经指定了后缀
        return "user/fm/index";

    }

}
