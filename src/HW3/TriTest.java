package HW3;

import java.util.Arrays;
import java.util.Scanner;

public class TriTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三個整數：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if (isTriangle(num1, num2, num3)) { //確認是否為三角形
            if (isEquilateral(num1, num2, num3)) {
                System.out.println("正三角形");
            } else if (isIsosceles(num1, num2, num3)) {
                System.out.println("等腰三角形");
            } else if (isRight(num1, num2, num3)) {
                System.out.println("正三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
    }

    private static boolean isTriangle(int num1, int num2, int num3) {
        return (num1 + num2 > num3) && (num1 + num3 > num3) && (num3 + num1 > num2);
    }

    private static boolean isEquilateral(int num1, int num2, int num3) {
        return (num1 == num2) && (num2 == num3) && (num1 != 0);
    }

    private static boolean isIsosceles(int num1, int num2, int num3) {
        return (num1 == num2 && num2 != num3)
                || (num2 == num3 && num1 != num3)
                || (num1 == num3 && num1 != num2);
    }

    private static boolean isRight(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);
        return Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2);
    }
}
