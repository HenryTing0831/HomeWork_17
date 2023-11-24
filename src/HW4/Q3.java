package HW4;

public class Q3 {
    public static void main(String[] args) {
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        System.out.println(count(planets));
    }

    private static int count(String[] strs) {
        int count = 0;
        for (String str : strs) {
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (isAeiou(c)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isAeiou(char c) {
        boolean ans = false;
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                ans = true;
        }
        return ans;
    }
}
