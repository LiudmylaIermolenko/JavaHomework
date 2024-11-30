package homework;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        getTimeLeft();
    }


    public static void getTimeLeft() {
        int n = new Random().nextInt(28800);
        System.out.println(n);
        int hours = n / 3600;
        if (hours == 0) {
            System.out.println("осталось менее часа");
        } else if (hours >= 2 && hours <= 4){
            System.out.println("осталось " + hours + " часа");
        } else if (hours == 1) {
            System.out.println("остался " + hours + " час");
        } else {
            System.out.println("осталось " + hours + " часов");
        }
    }
}
