package se.iths.twentytwo.generics;

import java.util.Objects;

public class Pair<T, V> {
    public final T first;
    public final V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <U, W> Pair<U, W> of(U first, W second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair pair)) return false;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
