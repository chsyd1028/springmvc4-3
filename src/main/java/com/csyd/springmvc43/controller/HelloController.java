package com.csyd.springmvc43.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *
 * </p>
 *
 * @author chengshanyunduo
 * @version v1.0
 * @ClassName: HelloController
 * @date 2018年09月19日 9:36
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Helloworld";
    }
}
