package org.asd._17_01_2025._Fib_Fac;
import static org.asd._17_01_2025._Fib_Fac.Factorial.*;
import static org.asd._17_01_2025._Fib_Fac.Main.printArray;

public class Calculation {

    public static void processAlgorithm(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case 1 -> {

                int[] fibonacciResult = calculateFibonacci(loopType, n);
                System.out.println("Ряд чисел Фибоначчи:");
                printArray(fibonacciResult);
            }
            case 2 -> {

                int factorialResult = calculateFactorial(loopType, n);
                System.out.println("Факториал: " + factorialResult);
            }
        }
    }

    public static boolean isValidAlgorithmID(int algorithmId) {
        switch (algorithmId) {
            case 1, 2 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public static boolean isValidLoopType(int loopType) {
        switch (loopType) {
            case 1, 2, 3 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }


    public static int[] calculateFibonacci(int loopType, int n) {
        FibonacciSequence fibonacci = new FibonacciSequence(n);

        if (loopType == 1) {
            return fibonacci.getFibonacciWhile();
        } else if (loopType == 2) {
            return fibonacci.getFibonacciDoWhile();
        } else {
            return fibonacci.getFibonacciFor();
        }
    }


    public static int calculateFactorial(int loopType, int n) {
        Factorial factorial = new Factorial(n);
        switch (loopType) {
            case 1:
                return factorial.factorialWhile(); // Цикл while
            case 2:
                return factorial.factorialDoWhile(); // Цикл do-while
            case 3:
                return factorial.factorialFor(); // Цикл for
            default:
                System.out.println("Неверный loopType.");
                return -1; // Возвращаем -1 как признак ошибки
        }
    }


}


