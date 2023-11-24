package HW4;

public class Q1 {
    private static int avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        System.out.println(avg(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg(arr)){
                System.out.print(arr[i] + "\t");
            }
        }
    }

}
