package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WenNumber2 {
    public static void main(String[] args) {
        System.out.println("討厭哪個數字？(1-9)");
        Scanner sc = new Scanner(System.in);
        int hate = sc.nextInt();
        int nums = 49;;
        int cnt = 0;
        List<Integer> arr = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();


        for (int i = 1 , row = 0; i <= nums ; i++ ) {
            if((i%10 != hate) && ( i/10 != hate)){
                System.out.print(i+ "\t");
                cnt++;
                row++;
                arr.add(i);
            }
            if(row % 6 == 0){
                System.out.println();
            }
        }
        System.out.printf("共有%d數字可選", cnt);
        System.out.println();

        Collections.shuffle(arr);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr.get(i)+"\t");
        }

//        System.out.println(arr);
//        System.out.println(n);
//
//
//        for (int i = 0; i < 6; i++) {
//            int randomIndex = (int) (Math.random() * arr.size());
//            System.out.print(ans.get(randomIndex) + "\t");
//
//        }
//        System.out.println(ans);

    }
}
