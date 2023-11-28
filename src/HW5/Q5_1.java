package HW5;

import java.util.Scanner;

public class Q5_1 {
    private static void starSquare(){
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入寬");
        width = scanner.nextInt();
        System.out.println("輸入高");
        height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starSquare();
    }
}
