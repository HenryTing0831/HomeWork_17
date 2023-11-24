package HW4;

public class Q6 {
    public static void main(String[] args) {
        int[][] exam = {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75},
        };
        int[] result = new int[8];
        for (int[] scores : exam) {
            int index = MaxIndex(scores);
            result[index]++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }

    private static int MaxIndex(int[] scores) {
        int index = 0;
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                index = i;
            }
        }
        return index;
    }
}
