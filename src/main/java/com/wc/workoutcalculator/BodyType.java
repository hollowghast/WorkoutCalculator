package com.wc.workoutcalculator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BodyType {
    ECTO("Ectomorph"),
    ECTO_MESO("Ecto-Mesomorph"),
    MESO_ECTO("Meso-Ectomorph"),
    MESO("Mesomorph"),
    MESO_ENDO("Meso-Endomorph"),
    ENDO_MESO("Endo-Mesomorph"),
    ENDO("Endomorph");

    private final String displayValue;
}
