package com.wc.workoutcalculator.analyzing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataHandlingController {
    @GetMapping("/units")
    public String[] getUnits(){
        String [] values = new String[Unit.values().length];
        for(int i = 0; i < Unit.values().length; i++) {
            values[i] = Unit.values()[i].toString();
        }
        return values;
    }
}
