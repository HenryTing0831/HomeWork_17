public class HW1 {
    public static void main(String[] args) {
        //1.
        int num1 = 12, num2 = 6;
        int sum = num1 + num2;
        System.out.println("12+6：" + sum);
        int product = num1 * num2;
        System.out.println("12*6：" + product);
        System.out.println("====================");
        //2.
        int eggs = 200, da = 12;
        int da1 = eggs / da;
        int ke = eggs % da;
        System.out.println("200顆蛋是" + da1 + "打" + ke + "顆");
        System.out.println("====================");
        //3.
        int sec = 256559;
        int seconds = 256559;
        int days = seconds / (24 * 60 * 60);
        seconds = seconds % (24 * 60 * 60);
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int min = seconds / 60;
        seconds = seconds % 60;

        System.out.println(sec + "秒為" + days + "天" + hours + "小時" + min + "分" + seconds + "秒");
        System.out.println("====================");
        //4.
        final double PI = 3.1415;
        int r = 5;
        double area = Math.pow(r, 2) * PI;
        double circumference = r * 2 * PI;
        System.out.printf("圓面積：%.3f%n", area);
        System.out.printf("圓周長:%.3f%n", circumference);
        System.out.println("====================");
        //5.
        double money = 1_500_000;
        double i = 0.02;
        int years = 10;
        for (int j = 1; j <= years; j++) {
            money = money * (1 + i);
        }

        System.out.printf("本金利息共:%.3f%n",money);
        System.out.println("====================");
        //6.
        System.out.println(5+5); //10  簡單的數字相加
        System.out.println(5+'5');//'5'為 char 5，依據Unicode的值為53 故結果為58
        System.out.println(5+"5");//"5"為字串 java會將此視為字串的連接 故結果為55
    }

}
