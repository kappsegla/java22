package se.iths.twentytwo.sthstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static se.iths.twentytwo.sthstream.HType.FALLOHID;
import static se.iths.twentytwo.sthstream.HType.STOOR;

public class HobbitsInformation {

    private final List<Hobbit> hobbits = new ArrayList<>();

    public static void main(String[] args) {
        new HobbitsInformation().run();
    }

    private void run() {

        hobbits.add(new Hobbit("Bilbo", new Fallohide(), FALLOHID));
        hobbits.add(new Hobbit("Frodo", new Fallohide(), FALLOHID));
        hobbits.add(new Hobbit("Gollum", new Stoor(), STOOR));

        //hobbits.forEach(System.out::println);
        hobbits.stream()
                .map(Hobbit::name)
                .forEach(System.out::println);

//        for (Hobbit hobbit : hobbits) {
//            System.out.println(hobbit.name());
//        }
        hobbits.forEach(System.out::println);

        var result = hobbits.stream()
                .collect(Collectors.groupingBy(Hobbit::type, Collectors.toList()));

        var result2 = hobbits.stream()
                .collect(Collectors.groupingBy(Hobbit::type2, Collectors.counting()));

        System.out.println(result);
        System.out.println(result2);

//        HType hType = HARFOOT;
//        int number = switch (hType) {
//            case HARFOOT -> 1;
//            case FALLOHID -> 2;
//            case STOOR -> 3;
//        };

    }


}

record Hobbit(String name, HobbitType type, HType type2) {
}

enum HType {
    HARFOOT, FALLOHID, STOOR
}

//Harfoot, Fallohid, Stoor
interface HobbitType {
    String getType();

}

class Stoor implements HobbitType {
    @Override
    public String getType() {
        return "Stoor";
    }

    @Override
    public String toString() {
        return getType();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass() && this.getType().equals(((Stoor) obj).getType());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getType());
    }

}

class Fallohide implements HobbitType {

    @Override
    public String getType() {
        return "Fallohid";
    }

    @Override
    public String toString() {
        return getType();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass() && this.getType().equals(((Fallohide) obj).getType());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getType());
    }
}

class Harfoot implements HobbitType {

    @Override
    public String getType() {
        return "Harfoot";
    }

    @Override
    public String toString() {
        return getType();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass() && this.getType().equals(((Harfoot) obj).getType());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getType());
    }

}

