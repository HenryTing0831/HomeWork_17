package HW3;

import java.util.Scanner;

public class WenNumber {
    public static void main(String[] args) {
        System.out.println("討厭哪個數字？(1-9)");
        Scanner sc = new Scanner(System.in);
        int hate = sc.nextInt();
        int nums = 49;;
        int cnt = 0;

        for (int i = 1 , row = 0; i <= nums ; i++ ) {
            if((i%10 != hate) && ( i/10 != hate)){
                System.out.print(i+ "\t");
                cnt++;
                row++;
            }
            if(row % 6 == 0){
                System.out.println();
            }
        }
        System.out.printf("共有%d數字可選", cnt);
        }
    }
