package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HW8_1 {
    //Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、
    // Double(5.1)、“Kitty”、Integer(100)、
    // Object物件、“Snoopy”、BigInteger(“1000”)
    public static void main(String[] args) {

        Collection<Object> myCollection = new ArrayList<>();

        myCollection.add(Integer.valueOf(100));
        myCollection.add(Double.valueOf(3.14));
        myCollection.add(Long.valueOf(21L));
        myCollection.add(Short.valueOf("100"));
        myCollection.add(Double.valueOf(5.1));
        myCollection.add("Kitty");
        myCollection.add(Integer.valueOf(100));
        myCollection.add(new Object());
        myCollection.add("Snoopy");
        myCollection.add(new BigInteger("1000"));

        Iterator<Object> iterator1 = myCollection.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("===============");
        for (int i = 0; i < myCollection.size(); i++) {
            Object item = ((ArrayList<Object>)myCollection).get(i);
            System.out.println(item);

        }
        System.out.println("===============");
        for (Object item : myCollection) {
            System.out.println(item);
        }
        //System.out.println("===============");
        // 移除不是java.lang.Number相關的物件
        Iterator<Object> iterator2 = myCollection.iterator();
        while(iterator2.hasNext()){
            Object item = iterator2.next();
            if(!(item instanceof Number))
                iterator2.remove();
            //Removes from the underlying collection the last
            //element returned by this iterator (optional operation).
        }

        System.out.println("=======移除後========");
        for (Object item : myCollection) {
            System.out.println(item);
        }

    }
}
