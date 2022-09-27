package se.iths.twentytwo.generics;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Pair {
    public final String first;
    public final String second;

    private Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public static Pair of(String first, String second) {
        return new Pair(first, second);
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
