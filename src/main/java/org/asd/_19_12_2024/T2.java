package org.asd._19_12_2024;

import java.util.Arrays;

public class T2 {
    /**
     * 11. Напишите метод, который принимает массив чисел и возвращает их сумму.
     */
    public static int sumArray(int[] numbers) {
        // TODO: реализовать метод
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
        }
        return sum;
    }

    /**
     * 12. Напишите метод, который принимает два числа и возводит первое в степень второго.
     */
    public static double power(int base, int exponent) {
        // TODO: реализовать метод
        if (exponent == 0) {
            return 1;
        }
        boolean isNegative = exponent < 0;
        if (isNegative) {
            exponent = -exponent;
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return isNegative ? 1.0 / result : result;

//        return Math.pow(base, exponent);
    }

    /**
     * 13. Напишите метод, который проверяет, является ли число простым.
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 14. Напишите метод, который принимает два числа и возвращает их наибольший общий делитель (НОД).
     */
    public static int gcd(int a, int b) {
        // Приведение чисел к положительным значениям (НОД всегда положителен)
        a = Math.abs(a);
        b = Math.abs(b);

        // Алгоритм Евклида
        while (b != 0) {
            int temp = b;
            b = a % b; // Остаток от деления
            a = temp;
        }
        return a; // Когда b становится 0, в a находится НОД
    }

    /**
     * 15. Напишите метод, который принимает массив чисел и возвращает его максимальный элемент.
     */
    public static int maxInArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * 16. Напишите метод, который принимает массив чисел и возвращает его минимальный элемент.
     */
    public static int minInArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * 17. Напишите метод, который проверяет, является ли число палиндромом
     * (одинаково читается слева направо и справа налево).
     */
    public static boolean isPalindrome(int number) {

        String str = String.valueOf(number);
        String reversedStr = "";
        if (number < 0) {
            return false; // Отрицательные числа не палиндромы
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); // Добавляем символ с конца строки
        }
        return str.equals(reversedStr);
    }

    /**
     * 18. Напишите метод, который возвращает n-ое число Фибоначчи.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            System.out.println("n должно быть положительным числом");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int prev1 = 1, prev2 = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    /**
     * 19. Напишите метод, который принимает массив чисел и сортирует его по возрастанию.
     */
    public static int[] sortArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
             if (numbers[j] > numbers[j+1]) {
                 int tmp = numbers[j];
                 numbers[j] = numbers[j+1];
                 numbers[j+1] = tmp;
             }
            }

        }

        return numbers;
    }

    /**
     * 20. Напишите метод, который принимает два числа и возвращает их наименьшее общее кратное (НОК).
     */
    public static int lcm(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int gcd = gcd(a, b); // НОД (наибольший общий делитель)
        // НОК (наименьшее общее кратное)
        return (a * b) / gcd;
    }
        // Метод для нахождения НОД
//        public static int gcd (int a, int b){
//            while (b != 0) {
//                int temp = b;
//                b = a % b;
//                a = temp;
//            }
//            return a;
//            }

        public static void main (String[]args){
//        int[] array = {1, 2, 3, 4, 10};
//        int result = sumArray(array); // Вызываем метод sumArray с массивом
//        System.out.println("Сумма массива: " + result);
//         System.out.println("T11: " +sumArray(array));
//         System.out.println("T12: " +power(2,0));
//         System.out.println("T13: " +isPrime(2));
//         System.out.println("T14: " +gcd(21, 10));
//        int[] array = {1, 2, 3, 4, 10};
//        System.out.println("T16: " + minInArray(array));
//        System.out.println("T17: " + isPalindrome(2121));
//        System.out.println("T18: " + fibonacci(10));
            int[] numbers = {5, 3, 8, 4, 2};
            System.out.println("Т19: Отсорт-е числа:");
            int[] sorted = sortArray(numbers);
            for (int i = 0; i < sorted.length; i++) {
                System.out.print(sorted[i] + " ");
            }
//        System.out.println(Arrays.toString(sortArray(numbers)));
            System.out.println("T20: " +lcm(10, 15));

        }
    }
