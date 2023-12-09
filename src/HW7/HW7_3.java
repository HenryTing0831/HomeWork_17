package HW7;

import java.io.*;

public class HW7_3 {

    public static void main(String[] args) {
        String sourceFilePath = "/Users/ting/Documents/source.txt";
        String destinationFilePath = "/Users/ting/Documents/destination.txt";

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        // Open input stream for the source file
        try (InputStream inputStream = new FileInputStream(sourceFilePath);
             // Open output stream for the destination file
             OutputStream outputStream = new FileOutputStream(destinationFilePath)) {

            // Set buffer size for efficient copying
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the input stream and write to the output stream
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            throw new IOException("Error copying file", e);
        }
    }
}
