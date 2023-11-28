package HW5;

public class Q5_2 {
    private static void randAvg(){
        int[] random = new int[10];
        int sum = 0;
        System.out.println("本次亂數結果");
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random()*100) +1;
            sum += random[i];
            System.out.print(random[i]+ "\t");
        }
        System.out.println();
        System.out.println("平均:" + sum/random.length);
    }
    public static void main(String[] args) {
        Q5_2.randAvg();
    }
}
