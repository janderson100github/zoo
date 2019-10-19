package com.zoo.model;

import java.math.BigDecimal;

public class Bird extends Animal {
    protected BigDecimal wingspan;

    public Bird(final String name, final String favoriteFood, final BigDecimal wingspan) {
        super(name, favoriteFood);
        this.wingspan = wingspan;
    }

    public BigDecimal getWingspan() {
        return wingspan;
    }

    public void setWingspan(final BigDecimal wingspan) {
        this.wingspan = wingspan;
    }
}
