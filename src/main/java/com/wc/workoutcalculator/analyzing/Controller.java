package com.wc.workoutcalculator.analyzing;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String index(Model m){
        m.addAttribute("currentYear", LocalDate.now().getYear());
        m.addAttribute("person", new Person());
        return "index";
    }

    @PostMapping("/result")
    public String postResult(@ModelAttribute Person p,
                             Model m){
        System.out.println(p);
        return "index";
    }

}
