package HW7.HW7_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HW7_5 {
    public static void main(String[] args) {
        // Define file path
        String filePath = "/Users/ting/Desktop/THA105/HomeWork_17/src/HW7/Object.ser";

        // Deserialize and read objects from file
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            // Read Dog objects
            Dog dog1 = (Dog) objectInputStream.readObject();
            Dog dog2 = (Dog) objectInputStream.readObject();

            // Read Cat objects
            Cat cat1 = (Cat) objectInputStream.readObject();
            Cat cat2 = (Cat) objectInputStream.readObject();

            // Execute speak() method
            dog1.speak();
            dog2.speak();
            cat1.speak();
            cat2.speak();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
