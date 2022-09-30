package se.iths.twentytwo.exercises.chapter7;

import java.util.Optional;

public class Safe<T> {

    private T thingToStore;

    public void store(T thingToStore) {
        this.thingToStore = thingToStore;
    }

    public Optional<T> retrieve() {
        if (thingToStore == null)
            return Optional.empty();
        else
            return Optional.of(thingToStore);
    }
}
