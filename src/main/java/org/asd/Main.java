package org.asd;


import lesson6.Dog;

import lesson8.Converter;
import lesson8.Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
//        task1
        System.out.println(Lesson8.getStudent(25));

//        task2
        Random random = new Random();
        double randomDouble = random.nextDouble() + random.nextInt(7, 456);

        System.out.println(Converter.runFahrenheitConverter(randomDouble));
        System.out.println(Converter.runKelvinConverter(randomDouble));



    }
}



