package org.asd._17_01_2025._Fib_Fac;
import static org.asd._17_01_2025._Fib_Fac.Factorial.*;

public class Calcullation {
    public static int[] calculateFibonacci(int loopType, int n) {
        FibonacciSequence fibonacci = new FibonacciSequence(n);

        if (loopType == 1) {
            return fibonacci.getFibonacciWhile();
        } else if (loopType == 2) {
            return fibonacci.getFibonacciDoWhile();
        } else if (loopType == 3) {
            return fibonacci.getFibonacciFor();
        } else {
            System.out.println("Неверный loopType.");
            return new int[0];
        }
    }


    public static int calculateFactorial(int loopType, int n) {
        switch (loopType) {
            case 1:
                return factorialWhile(n); // Цикл while
            case 2:
                return factorialDoWhile(n); // Цикл do-while
            case 3:
                return factorialFor(n); // Цикл for
            default:
                System.out.println("Неверный loopType.");
                return -1; // Возвращаем -1 как признак ошибки
        }
    }
}


