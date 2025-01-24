package org.asd._17_01_2025._Fib_Fac;

import java.util.Scanner;

public class InputData {
    public static int[] getInputData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите algorithmId (1 - Фибоначчи, 2 - Факториал):");
        int algorithmId = scanner.nextInt();

        System.out.println("Введите loopType (1 - while, 2 - do-while, 3 - for):");
        int loopType = scanner.nextInt();

        System.out.println("Введите n (количество чисел или значение для факториала):");
        int n;
        do {
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Ошибка! Значение n не может быть отрицательным. Попробуйте снова.");
            }
        } while (n < 0);

        return new int[]{algorithmId, loopType, n};
    }
}
