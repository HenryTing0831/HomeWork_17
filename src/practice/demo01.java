package practice;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        boolean result = coll.contains("aaa");
        System.out.println(result);


    }
}
