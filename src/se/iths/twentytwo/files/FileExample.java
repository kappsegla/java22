package se.iths.twentytwo.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class FileExample {

    public static void main(String[] args) {
//        System.out.println(System.getProperties().keySet());
//        System.out.println(System.getProperty("os.name"));

        String homeFolder = System.getProperty("user.home");
        System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "test.txt");
        System.out.println(filePath);

        System.out.println(Files.exists(filePath));

        readFileAsStream(filePath);

        try {
            //Files.createFile(filePath);
            //Files.move(filePath, Path.of(homeFolder,"moved.txt"));
            //Files.writeString(filePath, "Hello Worldåäö\n");//, StandardOpenOption.APPEND);

            String fileContent = Files.readString(filePath);
          //  var listOfLines = Files.readAllLines(filePath);
          //  System.out.println(listOfLines.get(0));
        }
        catch( FileAlreadyExistsException e){
            System.out.println("File already exists: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getClass().getName() + " " + e.getMessage());
        }
    }

    public static void readFileAsStream(Path filePath){
        try(Stream<String> lines = Files.lines(filePath)){
            lines.filter(s-> !s.startsWith("#")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
