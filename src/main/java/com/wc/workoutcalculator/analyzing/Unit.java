package com.wc.workoutcalculator.analyzing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Unit {
    METRIC("Metric", "kg", "cm", 0.3937),
    IMPERIAL("Imperial", "lbs", "inches", 2.54);

    private final String display_name;
    private final String mass_unit;
    private final String height_unit;
    private final Double exchangeRate;



}
