package com.zoo.model;

public class Dog extends Animal {
    protected DogType dogType;

    public Dog(final String name, final String favoriteFood, final DogType dogType) {
        super(name, favoriteFood);
        this.dogType = dogType;
    }

    @Override
    public String toString() {
        return "Dog   \t{" +
               "name='" + name + '\'' +
               ", favoriteFood='" + favoriteFood + '\'' +
               ", dogType=" + dogType +
               ", friends=" + friendsToString() +
               '}';
    }

    public DogType getDogType() {
        return dogType;
    }

    public void setDogType(final DogType dogType) {
        this.dogType = dogType;
    }
}
