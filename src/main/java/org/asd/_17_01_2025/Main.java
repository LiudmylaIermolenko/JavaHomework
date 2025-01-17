package org.asd._17_01_2025;

import static org.asd._19_12_2024.T3.printArray;

public class Main {
    public static void main(String[] args) {

        // Создание объекта с параметром
        FibonacciSequence fibonacci = new FibonacciSequence(6);
//        int[] array = {0, 1, 1, 2, 3, 5};

        // Тестирование методов
        System.out.println("Fibonacci через for:");
        printArray(fibonacci.getFibonacciFor());

        System.out.println("\nFibonacci через while:");
        printArray(fibonacci.getFibonacciWhile());

        System.out.println("\nFibonacci через do-while:");
        printArray(fibonacci.getFibonacciDoWhile());
    }

    //печать массива
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переход на новую строку
    }
    //для печати массива: for-ech:
//    private static void printArray(int[] array) {
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
    }

