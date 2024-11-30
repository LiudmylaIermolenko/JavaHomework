package homework;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        System.out.println(getNearestTo10(new Random().nextFloat(100), new Random().nextFloat(100)));
    }

    public static String getNearestTo10(float m, float n) {
        float differenceM = Math.abs(10 - m);
        float differenceN = Math.abs(10 - n);

        if (differenceM < differenceN) {
            return "Число " + m + " ближе к 10.";
        } else if (differenceN < differenceM) {
            return "Число " + n + " ближе к 10.";
        } else {
            return "Числа равны.";
        }
    }
}
