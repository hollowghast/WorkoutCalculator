package com.wc.workoutcalculator.analyzing;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private final String displayValue;

    Gender(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
