package HW4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[][] input = {
                {25, 32, 8, 19, 27},
                {2500, 800, 500, 1000, 1200}
                //[1,0] [1,1] [1,2]
        };

        System.out.println("輸入金額：");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int value = input[i][j];
                if (value >= money) {
                    count++;
                    System.out.print(input[0][j] + "\t");
                }
            }
        }
        System.out.printf("共%d人", count);
    }
}
