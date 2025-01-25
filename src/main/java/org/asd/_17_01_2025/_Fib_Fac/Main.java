package org.asd._17_01_2025._Fib_Fac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] inputData = InputData.getInputData();

        int algorithmId = inputData[0];
        int loopType = inputData[1];
        int n = inputData[2];

        Calculation.processAlgorithm(algorithmId, loopType, n);

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
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
/// /        System.out.println("Fibonacci using for(length = 6): " +
/// /                Arrays.toString(fibonacci2.getFibonacciFor()));
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









