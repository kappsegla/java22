package se.iths.twentytwo.animals;

import java.util.Objects;

public abstract class Mammal {

    public String name;
    int age;

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal mammal)) return false;

        if (age != mammal.age) return false;
        return Objects.equals(name, mammal.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    abstract void talk();
}
