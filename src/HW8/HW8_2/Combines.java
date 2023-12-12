package HW8.HW8_2;

import java.util.Iterator;
import java.util.TreeSet;

public class Combines {
    public static void main(String[] args) {
        TreeSet<Train> ts = new TreeSet<>();

        ts.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
        ts.add(new Train(118, "自強", "高雄", "台北", 500));
        ts.add(new Train(1288, "區間", "新竹", "基隆", 400));
        ts.add(new Train(122, "自強", "台中", "花蓮", 600));
        ts.add(new Train(1222, "區間", "樹林", "七堵", 300));
        ts.add(new Train(1254, "區間", "屏東", "基隆", 700));

        Iterator<Train> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
