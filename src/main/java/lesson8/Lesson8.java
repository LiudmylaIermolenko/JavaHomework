package lesson8;





import java.util.Random;

public class Lesson8 {

    public static int getStudent(int quantity) {
        Random random = new Random();
        return random.nextInt(2, quantity);
    }

//    task3
//1 part

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a + " b:" + b);
    }
}