package com.stark.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : StarkTan
 * CreateTime : 2019/5/16
 */
@Controller
public class HtmlTestController {

    @RequestMapping(path = {"", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(path = {"/login"})
    public String login() {
        return "login";
    }
}
