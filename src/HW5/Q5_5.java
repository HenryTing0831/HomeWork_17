package HW5;

public class Q5_5 {
    private static String genAuthCode(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] chars = characters.toCharArray();
        String result= "";
        int length = 8;
        int randomIndex;

        for (int i = 0; i < length; i++) {
            randomIndex = (int)(Math.random()*characters.length()+1);

            result += chars[randomIndex];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(genAuthCode());
    }
}
