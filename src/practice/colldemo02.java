package practice;

import java.util.ArrayList;
import java.util.Collection;

public class colldemo02 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();
        Student s1 = new Student("a",23);
        Student s2 = new Student("b", 24);
        Student s3 = new Student("c" ,25);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("a", 23);
        boolean res =coll.contains(s4);//默認使用object的equal方法
        //依賴地址值判斷
        //需要自定義的javabean中重寫方法
        System.out.println(res);

        System.out.println(coll.size());

    }
}
