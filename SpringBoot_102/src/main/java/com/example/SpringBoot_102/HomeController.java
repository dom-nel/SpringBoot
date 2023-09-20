package com.example.SpringBoot_102;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/") 
    public String homePage(Model model) {
        model.addAttribute("myvar", "Say hello to the people");
        return "hometemplate";
    }
}
