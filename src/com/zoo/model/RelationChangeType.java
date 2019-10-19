package com.zoo.model;

public enum RelationChangeType {
    ADD("Add", "established"),
    REMOVE("Remove", "lost");

    private String type;
    private String verb;

    private RelationChangeType(final String type, final String verb) {
        this.type = type;
        this.verb = verb;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }

    public String getVerb() {
        return verb;
    }
}
