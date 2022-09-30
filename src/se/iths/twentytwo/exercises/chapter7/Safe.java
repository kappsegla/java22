package se.iths.twentytwo.exercises.chapter7;

public class Safe<T> {

    private T thingToStore;

    public void store(T thingToStore) {
        this.thingToStore = thingToStore;
    }

    public T retrieve() {
        return thingToStore;
    }
}
