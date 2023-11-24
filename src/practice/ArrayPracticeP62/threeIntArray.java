package practice.ArrayPracticeP62;

public class threeIntArray {
    public int[][] getArray() {
        int[][] data = new int[3][3];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * 30) + 1;
            }
        }
        return data;
    }

    public static int[][] sumArr(int[][] arr1, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        threeIntArray tra = new threeIntArray();
        int[][] x =  tra.getArray();
        int[][] y =  tra.getArray();
        int[][] z =  new int[3][3];

        System.out.println("===array x===");
        printArray(x);
        System.out.println("===array y===");
        printArray(y);
        sumArr(x,y,z);
        System.out.println("===array z===");
        printArray(z);

    }
}
