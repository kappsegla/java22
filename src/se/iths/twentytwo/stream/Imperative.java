package se.iths.twentytwo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Imperative {

    public static void main(String[] args) {

        List<String> stringList = List.of("A","B","C","D","E","F");

        boolean containsA = stringList.contains("A");

        String[] arr = new String[]{"",""};

        List<String> ls = new ArrayList<>(List.of(arr));
        List<String> la = Arrays.asList(new String[5]);
        List<String> lf = List.of(arr);
        List<String> lc = List.copyOf(ls);
        List<String> lu = Collections.unmodifiableList(ls);

        handleList(ls);


    }

    public static void handleList(List<?> theList) {
        if( !theList.isEmpty())
            theList.remove(0);
    }


}
