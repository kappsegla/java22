package se.iths.twentytwo.files;

import java.io.IOException;
import java.nio.file.*;

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


        try {
            //Files.createFile(filePath);
            //Files.move(filePath, Path.of(homeFolder,"moved.txt"));
            Files.writeString(filePath, "Hello World\n");//, StandardOpenOption.APPEND);
        }
        catch( FileAlreadyExistsException e){
            System.out.println("File already exists: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getClass().getName() + " " + e.getMessage());
        }


    }
}
