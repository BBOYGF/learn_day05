package com.learn;
import com.learn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//控制器的类
@Controller
@SessionAttributes(value = {"name"})
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
    @RequestMapping(path="/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("测试成功！");
        System.out.println(request.getSession());
        System.out.println(request.getSession().getServletContext());
        System.out.println(response);
        return "success";
    }
    @RequestMapping("/requsetParam")
    public String requestParam(@RequestParam(name="name") String username){
        System.out.println("name:"+username);
        return "success";
    }
    @RequestMapping("/requestCookieValue")
    public String requestCookieValue(@CookieValue(value="JSESSIONID")String cookieValue){
        System.out.println("cookieValue:"+cookieValue);
        return "success";
    }
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes执行了。。。");
        model.addAttribute("name","郭文");
        return "success";
    }
}

