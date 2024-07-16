package com.keyin;

import java.time.LocalDate;


class Animal {
    private String type;
    private String name;
    private LocalDate arrivalDate;
    private int age;
    private String breed;
    private double weight;
    private LocalDate dateOfBirth;

    public Animal(String type, String name, LocalDate arrivalDate, int age, String breed, double weight, LocalDate dateOfBirth) {
        this.type = type;
        this.name = name;
        this.arrivalDate = arrivalDate;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format(
                "Animal " + type + '\n' + "Name: " + name + '\n' + "Arrival date: " + arrivalDate + '\n'
                + "Age: " + age + '\n' + "Breed: " + breed + '\n' + "Weight: " + weight + '\n'
                + "Date of birth: " + dateOfBirth +  "\n\n");



    }
}