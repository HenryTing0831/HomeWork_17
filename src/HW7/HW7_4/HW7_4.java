package HW7.HW7_4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HW7_4 {

    private static void createDataFolder(String folderPath) {
        Path folder = Paths.get(folderPath);
        if (Files.notExists(folder)) {
            try {
                Files.createDirectories(folder);
                System.out.println("Data folder created at " + folderPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("mimi");
        Cat cat2 = new Cat("Meow");
        Dog dog1 = new Dog("LittleBlack");
        Dog dog2 = new Dog("LittleWhite");

        String filePath = "/Users/ting/Desktop/THA105/HomeWork_17/src/HW7/Object.ser";

        createDataFolder("/Users/ting/Desktop/THA105/HomeWork_17/src/HW7");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(dog1);
            objectOutputStream.writeObject(dog2);
            objectOutputStream.writeObject(cat1);
            objectOutputStream.writeObject(cat2);
            objectOutputStream.close();

            System.out.println("Objects have been serialized and written to " + filePath);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}