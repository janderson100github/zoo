package com.zoo.model;

public class RelationChange {
    private Animal fromAnimal;
    private Animal toAnimal;
    private RelationChangeType relationChangeType;

    public RelationChange(final Animal fromAnimal, final Animal toAnimal, final RelationChangeType relationChangeType) {
        this.fromAnimal = fromAnimal;
        this.toAnimal = toAnimal;
        this.relationChangeType = relationChangeType;
    }

    @Override
    public String toString() {
        return String.format("%s has %s friendship with %s", fromAnimal.getName(), relationChangeType.getVerb(), toAnimal.getName());
    }

    public Animal getFromAnimal() {
        return fromAnimal;
    }

    public void setFromAnimal(final Animal fromAnimal) {
        this.fromAnimal = fromAnimal;
    }

    public Animal getToAnimal() {
        return toAnimal;
    }

    public void setToAnimal(final Animal toAnimal) {
        this.toAnimal = toAnimal;
    }
}
