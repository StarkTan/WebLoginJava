package com.stark.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : StarkTan
 * CreateTime : 2019/5/16
 */
@RestController
@RequestMapping("/rest")
public class RestTestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
