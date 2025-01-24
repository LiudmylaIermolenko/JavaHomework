package org.asd._17_01_2025._Fib_Fac;

        public class Factorial {
            public static int factorialWhile ( int n){
            int result = 1, i = 1;
            while (i <= n) {
                result *= i;
                i++;
            }
            return result;
        }
        public static int factorialDoWhile ( int n){
            int result = 1, i = 1;
            do {
                result *= i;
                i++;
            } while (i <= n);
            return result;
        }
        public static int factorialFor ( int n){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

            //    public static int calculateFactorial(int loopType, int n) {
//        if (loopType == 1) {
//            return factorialWhile(n); // Цикл while
//        } else if (loopType == 2) {
//            return factorialDoWhile(n); // Цикл do-while
//        } else if (loopType == 3) {
//            return factorialFor(n); // Цикл for
//        } else {
//            System.out.println("Неверный loopType.");
//            return -1; // Ошибка
//        }
//    }
    }


