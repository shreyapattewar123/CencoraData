//package com.pack.sample.controller;
//
//import com.pack.sample.model.Person;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Controller
//public class PersonController {
//
//
//    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    public ModelAndView printHello(HttpServletRequest request, HttpServletResponse response)
//    {
//        //modelMap.addAttribute("message","Hello !!this is Spring mvc application");
//        String name=request.getParameter("name");
//        int age = Integer.parseInt(request.getParameter("age"));
//        int id = Integer.parseInt(request.getParameter("id"));
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("person.jsp");
//        Person pr=new Person(name,age);
//
//        modelAndView.addObject("name",name);
//        modelAndView.addObject("age",age);
//        modelAndView.addObject("id",id);
//        return modelAndView;
//    }
//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    public String login(ModelMap modelMap)
//    {
//        modelMap.addAttribute("name","Login Successful");
//
//        return "person";
//    }
//
//
//}
//
