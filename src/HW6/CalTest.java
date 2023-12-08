package HW6;

import java.util.Scanner;

public class CalTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("輸入x: ");
            int x = scanner.nextInt();

            System.out.print("輸入y: ");
            int y = scanner.nextInt();

            int result = calculator.powerXY(x, y);
            System.out.printf("%d的%d次方等於%d",x,y, result);
        } catch (CalException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: 輸入格式不正確");
        } finally {
            scanner.close();
        }
    }
}