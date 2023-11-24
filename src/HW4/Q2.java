package HW4;

public class Q2 {
    public static void main(String[] args) {
        String s = "Hello World";

//        int i = 0;
//        int j = s.length() - 1;
        char[] chars = s.toCharArray();
//
//        while (i < j) {
//            char temp = chars[i];
//            chars[i] = chars[j];
//            chars[j] = temp;
//            i++;
//            j--;
//        }

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        System.out.println(chars);

        }
        //StringBuilder sb = new StringBuilder();
//       sb.append(s).reverse();
//        System.out.println(sb);
    }


