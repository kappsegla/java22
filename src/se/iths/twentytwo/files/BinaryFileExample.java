package se.iths.twentytwo.files;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaryFileExample {

    public static void main(String[] args) throws IOException {

        byte [] bytes = ByteBuffer.allocate(4).putInt(123456789).array();
        Path binary = Files.createTempFile("some", ".txt");
        Files.write(binary, bytes);
        System.out.println("tempBinaryFile = " + binary);
    }
}
