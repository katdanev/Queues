package com.keyin;

import java.util.LinkedList;
import java.util.Queue;

public class Shelter {
    private Queue<Dog> dogs;
    private Queue<Cat> cats;

    public Shelter() {
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
    }

    // 1. We need to add any animal to our list.Dogs adding to dog list, cats adding to cats list

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }
    // 2. Remove and return the oldest animal (any type) from the shelter. Check if isEmpty

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return cats.poll(); // remove oldest
        } else if (cats.isEmpty()) {
            return dogs.poll();
        }

        Dog oldestDog = dogs.peek(); // Retrieves, but does not remove
        Cat oldestCat = cats.peek();

        if (oldestDog.getArrivalDate().isBefore(oldestCat.getArrivalDate())) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }
}


// enqueue - додавання, dequeueAny - віднімання, dequeueDog, and dequeueCat.