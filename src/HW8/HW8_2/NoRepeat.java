package HW8.HW8_2;

import java.util.HashSet;
import java.util.Set;

public class NoRepeat {
    public static void main(String[] args) {
        Set<Train> trainSet = new HashSet<>();


        // 創建並添加 Train 物件到 Set 集合
        trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

        // 印出 Set 集合內容
        for (Train train : trainSet) {
            System.out.println(train);
        }
    }
}
