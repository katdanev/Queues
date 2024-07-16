package com.keyin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Dog dog1 = new Dog("Tobbie", LocalDate.of(2019, 1, 1), 5, "Chihuahua", 4.0, LocalDate.of(2018, 6, 1));
        Dog dog2 = new Dog("Mulia", LocalDate.of(2020, 3, 1), 4, "York", 5.0, LocalDate.of(2019, 7, 1));
        Dog dog3 = new Dog("Bonbon", LocalDate.of(2021, 6, 1), 3, "Griffon", 6.0, LocalDate.of(2020, 7, 1));
        Cat cat1 = new Cat("Liza", LocalDate.of(2022, 6, 2), 2, "Siamese", 10.0, LocalDate.of(2021, 6, 2));
        Cat cat2 = new Cat("Molot", LocalDate.of(2023, 3, 2), 1, "None", 2.0, LocalDate.of(2022, 7, 2));
        Cat cat3 = new Cat("Mittens", LocalDate.of(2024, 7, 2), 1, "Persian", 3.0, LocalDate.of(2023, 7, 2));

        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(cat3);

        System.out.println('\n' + "Adopting any oldest animal: " + '\n');
        System.out.println(shelter.dequeueAny());
        System.out.println("Adopting an oldest  dog:" + '\n');
        System.out.println(shelter.dequeueDog());
        System.out.println("Adopting an oldest cat:" + '\n');
        System.out.println(shelter.dequeueCat());

        System.out.println("Remaining animals in shelter:" + "\n\n");
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueAny());
    }
}
