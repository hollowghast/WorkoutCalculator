package com.wc.workoutcalculator.analyzing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public enum Unit {
    METRIC("kg", "cm", 0.3937),
    IMPERIAL("lbs", "inches", 2.54);

    private final String mass_unit;
    private final String height_unit;
    private final Double exchangeRate;


    public String toString() {
        return this.name() + ";" + mass_unit + ";" + height_unit + ";" + exchangeRate;
    }

}
