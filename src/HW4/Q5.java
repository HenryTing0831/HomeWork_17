package HW4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("年");
        int year = sc.nextInt();
        System.out.println("月");
        int month = sc.nextInt();
        System.out.println("日");
        int day = sc.nextInt();
        if(!checkValid(year,month,day)){
            System.out.printf("%d月的日期不該超過%d", month,day);
        }else {
            System.out.printf("輸入日期為該年的第%d天",days(year,month,day));
        }


    }
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    private static int days(int year, int month, int day){
        int result = day;
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year)){
            daysInMonth[2] = 29;
        }
        for (int i = 1; i < month; i++) {
            result += daysInMonth[i];
        }
        return result;
    }
    private static boolean checkValid(int year, int month, int day){
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year)){
            daysInMonth[2] = 29;
        }
        if(day > daysInMonth[month]){
            return false;
        }
        return true;
    }

}
