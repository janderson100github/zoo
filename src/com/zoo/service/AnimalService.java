package com.zoo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import com.zoo.model.Animal;
import com.zoo.model.Chicken;
import com.zoo.model.Dog;
import com.zoo.model.DogType;
import com.zoo.model.Parrot;
import com.zoo.model.RelationChange;
import com.zoo.model.RelationChangeType;

public class AnimalService {

    private List<Animal> animals = new ArrayList<>();
    private List<RelationChange> relationChanges = new ArrayList<>();

    public void intializeAnimalSet() {
        animals.add(new Dog("Dog one", "Meat", DogType.HUNTING));
        animals.add(new Dog("Dog two", "Fresh meat", DogType.ASSISTANCE));
        animals.add(new Dog("Dog three", "Pedigree", DogType.RACING));
        animals.add(new Parrot("Parrot one", "Grain", new BigDecimal("0.25"), Boolean.FALSE));
        animals.add(new Parrot("Parrot two", "Corn", new BigDecimal("0.5"), Boolean.TRUE));
        animals.add(new Chicken("Chicken one", "Corn", new BigDecimal("0.75"), Boolean.TRUE));
        animals.add(new Chicken("Chicken two", "Corn", new BigDecimal("0.75"), Boolean.FALSE));
    }

    public void shuffleFriends() {
        relationChanges.clear();
        for (Animal animal : animals) {
            if (AnimalService.getRandomBoolean()) {
                addRelation(animal);
            }
            if (AnimalService.getRandomBoolean()) {
                removeRelation(animal);
            }
        }
    }

    public String animalsToString() {
        return String.join("\n", animals.stream().map(Animal::toString).collect(Collectors.toList()));
    }

    public String relationChangesToString() {
        return String.join("\n", relationChanges.stream().map(RelationChange::toString).collect(Collectors.toList()));
    }

    private void addRelation(final Animal animal) {
        List<Animal> candidates = animals.stream()
                .filter(candidate -> !animal.getFriends().contains(candidate))
                .filter(candidate -> !registeredRelationChange(animal, candidate))
                .filter(candidate -> !candidate.equals(animal))
                .collect(Collectors.toList());
        if (!candidates.isEmpty()) {
            Animal candidate = candidates.get(new Random().nextInt(candidates.size()));

            animal.getFriends().add(candidate);
            relationChanges.add(new RelationChange(animal, candidate, RelationChangeType.ADD));

            candidate.getFriends().add(animal);
            relationChanges.add(new RelationChange(candidate, animal, RelationChangeType.ADD));
        }

    }

    private void removeRelation(final Animal animal) {
        List<Animal> candidates = animal.getFriends().stream()
                .filter(candidate -> !registeredRelationChange(animal, candidate))
                .collect(Collectors.toList());
        if (!candidates.isEmpty()) {
            Animal candidate = candidates.get(new Random().nextInt(candidates.size()));

            animal.getFriends().remove(candidate);
            relationChanges.add(new RelationChange(animal, candidate, RelationChangeType.REMOVE));

            candidate.getFriends().remove(animal);
            relationChanges.add(new RelationChange(candidate, animal, RelationChangeType.REMOVE));
        }
    }

    private boolean registeredRelationChange(final Animal fromAnimal, final Animal toAnimal) {
        return relationChanges.stream()
                .anyMatch(relationChange -> relationChange.getFromAnimal().equals(fromAnimal)
                                            && relationChange.getToAnimal().equals(toAnimal));
    }

    private static <E> E getRandomSetElement(Set<E> set) {
        return set.stream().skip(new Random().nextInt(set.size())).findFirst().orElse(null);
    }

    private static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }
}
