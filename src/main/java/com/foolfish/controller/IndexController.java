package com.foolfish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fxy on 2017/9/29.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("name", "NotifyMe");
        return "index";
    }

}
