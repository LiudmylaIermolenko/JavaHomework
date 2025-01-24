package org.asd._17_01_2025._Fib_Fac;

import java.util.Arrays;

import static org.asd._17_01_2025._Fib_Fac.Calcullation.calculateFactorial;
import static org.asd._17_01_2025._Fib_Fac.Calcullation.calculateFibonacci;
import static org.asd._17_01_2025._Fib_Fac.InputData.getInputData;

public class Main {
    public static void main(String[] args) {

        int[] inputData = getInputData();

        int algorithmId = inputData[0];
        int loopType = inputData[1];
        int n = inputData[2];

        switch (algorithmId) {
            case 1 -> {
                // Числа Фибоначчи
                int[] fibonacciResult = calculateFibonacci(loopType, n);
                System.out.println("Ряд чисел Фибоначчи:");
                printArray(fibonacciResult);
            }
            case 2 -> {
                // Факториал
                int factorialResult = calculateFactorial(loopType, n);
                System.out.println("Факториал: " + factorialResult);
            }
            default -> System.out.println("Неверный algorithmId.");
        }
    }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
//            for (int num : array) {
//                System.out.print(num + " ");
            }
            System.out.println();
        }
    }






//        FibonacciSequence fibonacci1 = new FibonacciSequence();
//        FibonacciSequence fibonacci2 = new FibonacciSequence(6);
//
//        System.out.println(Arrays.toString(fibonacci1.getFibonacciFor()));
//        System.out.println(Arrays.toString(fibonacci2.getFibonacciFor()));
//
//        FibonacciSequence fibonacci3 = new FibonacciSequence(-5);
//        System.out.println(Arrays.toString(fibonacci3.getFibonacciFor()));
//
////        System.out.println("Fibonacci using for(length = 6): " +
////                Arrays.toString(fibonacci2.getFibonacciFor()));
//
//        fibonacci2.setLength(10);
//        System.out.println("Fibonacci using for(length = 10): " +
//                Arrays.toString(fibonacci2.getFibonacciFor()));
//
//        System.out.println("Fibonacci using while(length = 10): " +
//                Arrays.toString(fibonacci2.getFibonacciWhile()));
//
//        System.out.println("Fibonacci using do-while(length = 10): " +
//                Arrays.toString(fibonacci2.getFibonacciDoWhile()));
//
//        fibonacci2.setLength(-3);
//        System.out.println("Fibonacci using for: " +
//                Arrays.toString(fibonacci2.getFibonacciFor()));
//        fibonacci2.setLength(-3);
//        System.out.println("Fibonacci using while: " +
//                Arrays.toString(fibonacci2.getFibonacciWhile()));
//
//        System.out.println("Fibonacci using do-while: " +
//                Arrays.toString(fibonacci2.getFibonacciDoWhile()));
//    }
//}









