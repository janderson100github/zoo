package com.zoo;

import com.zoo.service.AnimalService;

public class Main {

    public static int ITERATIONS = 5;

    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();

        animalService.intializeAnimalSet();
        System.out.println(animalService.animalsToString());

        for (int i = 1; i <= ITERATIONS; i++) {
            animalService.shuffleFriends();
            System.out.println("\n-------------- " + i + " -----------------");
            System.out.println(animalService.relationChangesToString() + "\n");
            System.out.println(animalService.animalsToString());
        }
    }
}
