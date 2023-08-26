package com.wc.workoutcalculator.analyzing;

import lombok.*;

@Data
@NoArgsConstructor
public class Person {
    private Gender gender;
    private Integer height;
    private Float mass;
    private Unit unit;
    private BodyType bodyType;

}
