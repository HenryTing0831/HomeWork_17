public class HW2 {
    public static void main(String[] args) {
        //1
        int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("============");
        //2
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println(product);
        System.out.println("============");
        //3
        int i = 1, product2 = 1;
        while (i <= 10) {
            product2 *= i;
            i++;
        }
        System.out.println(product2);
        //4
        System.out.println("============");
        for (int j = 1, k = 1; j <= 10; j++, k++) {
            System.out.print(j * k + "\t");
        }
        System.out.println();
        System.out.println("============");
        //5
        int count = 0;
        for (int j = 1; j <= 49; j++) {

            if (j < 40 && j % 10 == 4 || (j >= 40)) {
                System.out.print(j + " ");
                count++;
            }
        }
        System.out.println("阿文可以選的數字共" + count + "個");

        System.out.println("============");
        //6
        for (int j = 1; j <= 10; j++) {
            for (int k = 1; k <= 10 - j + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("============");
        //7
        for (int j = 65; j <= 70; j++) {
            for (int k = 65; k <= j; k++) {
                System.out.print((char) j);
            }
            System.out.println();
        }

    }
}



