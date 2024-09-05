package com.pack.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController
{
    @RequestMapping("/")
    public String home()
    {

        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("username")String username ,@RequestParam("password") String password)
    {
        ModelAndView mv = new ModelAndView();
        if ("admin".equals(username) && "password".equals(password)) {
            mv.setViewName("result"); // Redirect to welcome page on successful login
            mv.addObject("username", username);
        } else if(username!="admin" && password!="password") {
            mv.setViewName("index"); // Redirect back to login page on failure
            mv.addObject("error", "Invalid username or password. Please try again.");
        }else{
            mv.setViewName("signup");
    }

        return  mv;

    }

}