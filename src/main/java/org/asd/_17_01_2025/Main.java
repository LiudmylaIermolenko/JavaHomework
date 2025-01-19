package org.asd._17_01_2025;

import java.util.Arrays;

import static org.asd._19_12_2024.T3.printArray;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence fibonacci1 = new FibonacciSequence();
        FibonacciSequence fibonacci2 = new FibonacciSequence(6);

        System.out.println(Arrays.toString(fibonacci1.getFibonacciFor()));
        System.out.println(Arrays.toString(fibonacci2.getFibonacciFor()));

        FibonacciSequence fibonacci3 = new FibonacciSequence(-5);
        System.out.println(Arrays.toString(fibonacci3.getFibonacciFor()));

//        System.out.println("Fibonacci using for(length = 6): " +
//                Arrays.toString(fibonacci2.getFibonacciFor()));

        fibonacci2.setLength(10);
        System.out.println("Fibonacci using for(length = 10): " +
                Arrays.toString(fibonacci2.getFibonacciFor()));

        System.out.println("Fibonacci using while(length = 10): " +
                Arrays.toString(fibonacci2.getFibonacciWhile()));

        System.out.println("Fibonacci using do-while(length = 10): " +
                Arrays.toString(fibonacci2.getFibonacciDoWhile()));

        fibonacci2.setLength(-3);
        System.out.println("Fibonacci using for: " +
                Arrays.toString(fibonacci2.getFibonacciFor()));
        fibonacci2.setLength(-3);
        System.out.println("Fibonacci using while: " +
                Arrays.toString(fibonacci2.getFibonacciWhile()));

        System.out.println("Fibonacci using do-while: " +
                Arrays.toString(fibonacci2.getFibonacciDoWhile()));







//        // Проверка на отрицательную длину через сеттер
//        fibonacci.setLength(-3);
//        System.out.println("\nAfter trying to set negative length:");
//        System.out.println("Length: " + fibonacci.getLength());
//        System.out.println("Fibonacci with negative length:");
//        System.out.println(Arrays.toString(fibonacci.getFibonacciFor()));
//
//        fibonacci.setLength(1);
//        System.out.println("\nAfter setting length = 1:");
//        System.out.println(Arrays.toString(fibonacci.getFibonacciFor()));
//
//        fibonacci.setLength(0);
//        System.out.println("\nAfter setting length = 0:");
//        System.out.println(Arrays.toString(fibonacci.getFibonacciFor()));
//
//        System.out.println("Fibonacci через for:");
//        printArray(fibonacci.getFibonacciFor());
//
//        System.out.println("\nFibonacci через while:");
//        printArray(fibonacci.getFibonacciWhile());
//
//        System.out.println("\nFibonacci через do-while:");
//        printArray(fibonacci.getFibonacciDoWhile());
   //}

//    private static FibonacciSequence getFibonacciSequence() {
//        FibonacciSequence fibonacci = new FibonacciSequence();
//        System.out.println("Default constructor, length: " + fibonacci.getLength());
//        System.out.println("Fibonacci with length = 0:");
//        System.out.println(Arrays.toString(fibonacci.getFibonacciFor()));

//        fibonacci = new FibonacciSequence(6);
//        System.out.println("\nConstructor with parameter, length: " + fibonacci.getLength());
//        System.out.println("Fibonacci with length = 6:");
//        System.out.println(Arrays.toString(fibonacci.getFibonacciFor()));

//        fibonacci.setLength(-3);
//        return fibonacci;
//    }

    //печать массива
//    private static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println(); // Переход на новую строку
//    }
    //для печати массива: for-ech:
//    private static void printArray(int[] array) {
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
    }
    }

