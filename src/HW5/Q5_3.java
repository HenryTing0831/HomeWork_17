package HW5;

public class Q5_3 {
    private static int maxElement(int[][] array ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]> max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    private static double maxElement(double[][] array ){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]> max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] IntArray = {
                {1, 6, 3},
                {9, 5, 2}
        };
        double[][] DoubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };
        System.out.println(Q5_3.maxElement(IntArray));
        System.out.println(Q5_3.maxElement(DoubleArray));
    }
}
