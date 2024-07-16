package com.keyin;

import java.time.LocalDate;

class Dog extends Animal {

    public Dog(String name, LocalDate arrivalDate, int age, String breed, double weight, LocalDate dateOfBirth) {

        super("Dog", name, arrivalDate, age, breed, weight, dateOfBirth);
    }


}
