package com.aiden.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/login")
    public ModelAndView login() {
        System.out.print("----login----");

        //Call Service, Access data, implement function.

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "Aiden");
        //Let the view know the path of the page.
        mv.setViewName("success");
        return mv;
    }
}
