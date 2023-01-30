package com.wc.workoutcalculator.analyzing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {
    private Gender gender;
    private Integer height;
    private Float mass;
    private Unit unit;
    private BodyType bodyType;

}
