package HW8.HW8_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Train_1 {
    // 屬性
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    // 建構子
    public Train_1(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString 方法，用於將物件轉為字串表示
    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Train_1 train = (Train_1) o;

        return number == train.number &&
                Double.compare(train.price, price) == 0 &&
                Objects.equals(type, train.type) &&
                Objects.equals(start, train.start) &&
                Objects.equals(dest, train.dest);
    }

    public static void main(String[] args) {
       Set<Train_1> trainSet = new HashSet<>();


        // 創建並添加 Train 物件到 Set 集合
        trainSet.add(new Train_1(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Train_1(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Train_1(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Train_1(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Train_1(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Train_1(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Train_1(1254, "區間", "屏東", "基隆", 700));

        // 印出 Set 集合內容
        for (Train_1 train : trainSet) {
            System.out.println(train);
        }
    }
}


