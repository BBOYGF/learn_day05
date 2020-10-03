package com.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/test")
public class controllerSuccess {
    @RequestMapping(path="/demo")
    public String getTset(String name)
    {
        System.out.println("绑定参数成功！参数是："+name);
        return "test";
    }
}
