package com.wc.workoutcalculator.analyzing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CalculatorController {
    @Autowired
    private DataHandlingController dhc;

    @GetMapping
    public String mainPage(Model m)
    {
        m.addAttribute("person", new Person());

        //return "forward:/html/main.html";
        //return "redirect:thymeleaf_index";
        return "thymeleaf_index";
    }
    @PostMapping
    public String createPerson(@ModelAttribute Person p){

        return "error";
    }
}
