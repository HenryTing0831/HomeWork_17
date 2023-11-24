package practice.ClassPracticeP53;

public class Student {
    int score = 90;
    public void play(int hours){
//        for (int i = 0; i < hours; i++) {
//            score--;
//        }
        score -= hours;
    }

    public void study(int hours){
//        for (int i = 0; i < hours; i++) {
//            score++;
//        }
        score += hours;
    }

    public static void main(String[] args) {

        Student stu1 = new Student();
       // stu1. score = 10;
        Student stu2 = new Student();
       // stu2.score = 15;

        stu1.play(5);
        stu1.study(3);

        stu2.play(8);
        stu2.study(3);

        System.out.println(stu1.score);
        System.out.println(stu2.score);



    }
}
