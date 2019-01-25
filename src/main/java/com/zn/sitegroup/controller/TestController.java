package com.zn.sitegroup.controller;/**
 * Created by Administrator on 2019/1/24.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shijiawei
 * @date 2019/1/24
 */
@RestController
@RequestMapping
public class TestController {
    public TestController() {
        System.out.println();
    }

    @RequestMapping(value = "/aaa", method = {RequestMethod.GET})
    public String getAaa() {
        return String.valueOf(123456);
    }
}
