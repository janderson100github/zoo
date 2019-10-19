package com.zoo.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Animal {
    protected String name;
    protected String favoriteFood;
    private Set<Animal> friends = new HashSet<>();

    public Animal(final String name, final String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public String friendsToString() {
        return "{" + String.join(", ", friends.stream().map(Animal::getName).collect(Collectors.toList())) + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Animal animal = (Animal) o;
        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(final String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Set<Animal> getFriends() {
        return friends;
    }
}
