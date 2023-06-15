package com.wc.workoutcalculator.analyzing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CalculatorController {
    @Autowired
    private DataHandlingController dhc;

    @GetMapping("/")
    public String mainPage()
    {
        return "forward:/html/main.html";
    }
}
