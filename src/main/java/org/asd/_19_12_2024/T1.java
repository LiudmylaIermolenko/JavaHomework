package org.asd._19_12_2024;

public class T1 {
    /**
     * 1. Напишите метод, который принимает два целых числа и возвращает их сумму.
     */


    public static int add(int a, int b) {
        // TODO: реализовать метод
        return a + b;
    }

    /**
     * 2. Напишите метод, который принимает два числа и возвращает их разность.
     */
    public static int subtract(int a, int b) {
        // TODO: реализовать метод
        return a - b;
    }

    /**
     * 3. Напишите метод, который принимает два числа и возвращает их произведение.
     */
    public static int multiply(int a, int b) {
        // TODO: реализовать метод
        return a * b;
    }

    /**
     * 4. Напишите метод, который принимает два числа и возвращает их частное.
     */
    public static double divide(int a, int b) {
        // TODO: реализовать метод (не забудьте учесть деление на ноль)
        if (b == 0) {
            System.out.println("Деление на ноль невозможно");
            return 0.0;
        }
            return (double) a / b;
    }



    /**
     * 5. Напишите метод, который принимает число и возвращает его квадрат.
     */
    public static int square(int a) {
        // TODO: реализовать метод
        return a * a;
    }

    /**
     * 6. Напишите метод, который принимает три числа и возвращает их среднее арифметическое.
     */
    public static double average(int a, int b, int c) {
        // TODO: реализовать метод
        return (double) (a + b + c) / 3.0;
    }

    /**
     * 7. Напишите метод, который принимает два числа и возвращает остаток от их деления.
     */
    public static int modulus(int a, int b) {
        // TODO: реализовать метод
        if (b == 0) {
            System.out.println("Деление на ноль невозможно");
            return 0;
        }
        return a % b;
    }

    /**
     * 8. Напишите метод, который принимает два числа и возвращает большее из них.
     */
    public static int max(int a, int b) {
        // TODO: реализовать метод

            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

//        or:
//        if (a > b) {
//            return a;
//        } else if (a < b) {
//            return b;
//        } else {
//            System.out.println("They are equal");
//            return a;
//        }
//    }

    /**
     * 9. Напишите метод, который принимает два числа и возвращает меньшее из них.
     */
    public static int min(int a, int b) {
        // TODO: реализовать метод
//        if (a < b) {
//            return a;
//        } else {
//            return b;
//        }
//    }

        or:
        if (a < b) {
            return a;
        } else if (a > b) {
            return b;
        } else {
            System.out.println("They are equal");
            return a;
        }
    }



    /**
     * 10. Напишите метод, который принимает число и проверяет, является ли оно четным.
     * Возвращает true, если число четное, и false, если нечетное.
     */
    public static boolean isEven(int a) {
        // TODO: реализовать метод

//        if (a % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }

           return a % 2 == 0;
    }


    public static void main(String[] args) {


        // Пример вызовов методов (после их реализации)
         System.out.println("T1; " + add(3, 5));
//         System.out.println("T4; " + divide(3, 0));
//         System.out.println("T6; " + average(3, 0, 3));
//         System.out.println("T7; " + modulus(37, 5));
//         System.out.println("T8; " + max(3, 3));
//         System.out.println("T9; " + min(33, 33));
         System.out.println("T10; " + isEven(10));

    }

}
