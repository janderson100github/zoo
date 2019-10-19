package com.zoo.model;

public enum DogType {
    HUNTING("Hunting"),
    ASSISTANCE("Assistance"),
    RACING("Racing");

    private String type;

    DogType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
