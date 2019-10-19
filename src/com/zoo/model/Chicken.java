package com.zoo.model;

import java.math.BigDecimal;

public class Chicken extends Bird {
    protected Boolean isBroiler;

    public Chicken(final String name, final String favoriteFood, final BigDecimal wingspan, final Boolean isBroiler) {
        super(name, favoriteFood, wingspan);
        this.isBroiler = isBroiler;
    }

    @Override
    public String toString() {
        return "Chicken\t{" +
               "name='" + name + '\'' +
               ", favoriteFood='" + favoriteFood + '\'' +
               ", isBroiler=" + isBroiler +
               ", wingspan=" + wingspan +
               ", friends=" + friendsToString() +
               '}';
    }

    public Boolean getBroiler() {
        return isBroiler;
    }

    public void setBroiler(final Boolean broiler) {
        isBroiler = broiler;
    }
}
