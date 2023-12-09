package HW7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW7_1 {
    public static void main(String[] args) {
        String fileName = "/Users/ting/Downloads/Sample.txt";

        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            int byteCount = 0;
            int charCount = 0;
            int lineCount = 0;

            int data;
            while ((data = fileInputStream.read()) != -1) {
                byteCount++;
            }
            fileInputStream.getChannel().position(0); // Reset file pointer
            while ((data = inputStreamReader.read()) != -1) {
                charCount++;
            }
            fileInputStream.getChannel().position(0); // Reset file pointer

            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
            System.out.println("File Stats for " + fileName + ":");
            System.out.println("Total Bytes: " + byteCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Total Lines: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
