package HW7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HW7_2 {
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }


    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/ting/Documents/Data.txt", true))) {

            for (int i = 0; i < 10; i++) {
                int randomNumber = generateRandomNumber(1, 1000);
                writer.write(Integer.toString(randomNumber));
                writer.newLine();
            }

            System.out.println("Data has been written to Data.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

