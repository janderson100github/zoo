package com.zoo.model;

import java.math.BigDecimal;

public class Parrot extends Bird {
    protected Boolean canSpeak;

    public Parrot(final String name, final String favoriteFood, final BigDecimal wingspan, final Boolean canSpeak) {
        super(name, favoriteFood, wingspan);
        this.canSpeak = canSpeak;
    }

    @Override
    public String toString() {
        return ("Parrot\t{" +
               "name='" + name + '\'' +
               ", favoriteFood='" + favoriteFood + '\'' +
               ", canSpeak=" + canSpeak +
               ", wingspan=" + wingspan +
               ", friends=" + friendsToString() +
               '}').replace(", ", "\t");
    }

    public Boolean getCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(final Boolean canSpeak) {
        this.canSpeak = canSpeak;
    }
}
