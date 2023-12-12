package HW8.HW8_2;

import java.util.Objects;

public class Train implements Comparable<Train>{
    // 屬性
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    // 建構子
    public Train(int number, String type, String start, String dest, double price) {
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

        Train train = (Train) o;

        return number == train.number &&
                Double.compare(train.price, price) == 0 &&
                Objects.equals(type, train.type) &&
                Objects.equals(start, train.start) &&
                Objects.equals(dest, train.dest);
    }


    @Override
    public int compareTo(Train other) {
        return Integer.compare(this.number, other.number)*-1;
    }
}


