package Ext;

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pencil("pencil", 100);
        Pen p2 = new InkBrush("InkBrush,", 150);

        p1.write();
        p2.write();
        System.out.printf("鉛筆定價100，實際售價為八折%d", (int)p1.getPrice());
        System.out.println();
        System.out.printf("墨筆定價150，實際售價為九折%d",(int) p2.getPrice());
    }
}
