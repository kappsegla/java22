package se.iths.twentytwo.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CSVReader {

    public static void main(String[] args) {
        String homePath = System.getProperty("user.home");

        Pattern pattern = Pattern.compile(",");

        try (Stream<String> lines = Files.lines(Path.of(homePath, "cakes.csv"))) {

            List<Cake> cakes = lines.skip(1).map(line -> {
                String[] arr = pattern.split(line);
                return new Cake(
                        Integer.parseInt(arr[0]),
                        arr[1],
                        Double.parseDouble(arr[2]));
            }).toList();

            cakes.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
