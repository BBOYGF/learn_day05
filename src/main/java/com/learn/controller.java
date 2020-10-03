package com.learn;
import com.learn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器的类
@Controller
 class HelloController {
    @RequestMapping(path="/hello",method = {RequestMethod.GET},headers={"Accept"})
    public String sayHello(){
        System.out.println("hell Strping MVC");
        return "success";
    }
    @RequestMapping(path="/saveUser")
    public String saveUser(User user)
    {
        System.out.println(user.toString());
        return "success";
    }

}

