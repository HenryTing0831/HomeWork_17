package HW3;

import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        System.out.println("開始猜數字吧");
        int random = (int)(Math.random()*100+1);

        while(true){
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();

            if(random == guess){
                System.out.println("猜對了，答案就是"+ guess);
                break;
            }else if(random > guess){
                System.out.println("猜錯囉，小於正確答案");
            } else{
                System.out.println("猜錯囉，大於正確答案");
            }
        }
    }

}
