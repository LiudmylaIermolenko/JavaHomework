package org.asd._19_12_2024;

import java.util.Arrays;

public class T4 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и удваивает каждый его элемент.
     */
    public static int[] doubleArrayElements(int[] array) {
        int[] doubleNumber = new int[array.length];//создаётся новый массив doubledArray того же размера.

        for (int i = 0; i < array.length; i++) {
            doubleNumber[i] = array[i]*2;// Удваиваем каждый элемент и записывается в новый массив.
            }
        return doubleNumber;

    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и
     * возвращает массив только с положительными числами.
     */
    public static int[] filterPositiveNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        // Создаем массив для хранения положительных чисел
        int[] positiveNumber = new int[count];
        int index = 0;
        // Заполняем массив положительными числами
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumber[index++] = array[i];
            }
        }

        return positiveNumber;
    }

    /**
     * 3. Напишите метод, который принимает два массива
     * целых чисел и возвращает их объединение.
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int [array1.length + array2.length];
        // Копируем элементы первого массива
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Копируем элементы второго массива
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        return mergedArray;
    }

    /**
     * 4. Напишите метод, который принимает массив целых
     * чисел и возвращает количество уникальных элементов.
     */
    public static int countUniqueElements(int[] array) {
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
              uniqueCount++;
            }
        }
        return uniqueCount;
    }

    /**
     * 5. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив, содержащий квадраты элементов исходного массива.
     */
    public static int[] squareArrayElements(int[] array) {
        int[] squareArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squareArray[i] = array[i] * array[i];

        }
        return squareArray;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает второй по величине элемент.
     */
    public static int findSecondLargest(int[] array) {
        int largest1 = array[0];
        int largest2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest1) {
                largest2 = largest1;
                largest1 = array[i];
            } else if (array[i] > largest2 && array[i] != largest1) {
                largest2 = array[i];
            }
        }
        return largest2;
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если массив содержит заданное число.
     */
    public static boolean containsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        // Если число не найдено, возвращаем false
        return false;
    }

    /**
     * 8. Напишите метод, который принимает массив целых чисел
     * и заменяет все отрицательные числа на 0.
     */
    public static int[] replaceNegativesWithZero(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }

        }
        return array;
    }

    /**
     * 9. Напишите метод, который принимает массив целых
     * чисел и возвращает индекс первого вхождения заданного числа.
     */
    public static int findFirstIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                return  i;
            }
        }
        //Если число не найдено: Метод возвращает -1, что означает, что число отсутствует в массиве.
        return -1;
    }

    /**
     * 10. Напишите метод, который принимает массив целых ч
     * исел и возвращает true, если в массиве нет повторяющихся элементов.
     */
    public static boolean hasNoDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i!= j) {
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
         int[] exampleArray = {1, -2, 5, 7, 5, 4};
//        int[] doubledArray = doubleArrayElements(exampleArray);
//        for (int num : doubledArray) {
//            System.out.print(num + " ");
//        }
         //System.out.println("T1: " + Arrays.toString(doubleArrayElements(exampleArray)));
//        int[] positiveArray = filterPositiveNumbers(exampleArray);
//        for (int num : positiveArray) {
//            System.out.print(num + " ");
//        }
         //System.out.println("T2: " + Arrays.toString(filterPositiveNumbers(exampleArray)));
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//         System.out.println("T3: " + Arrays.toString(mergeArrays(array1, array2)));
//         System.out.println("T4: " + countUniqueElements(exampleArray));
//         System.out.println("T5: " + Arrays.toString(squareArrayElements(exampleArray)));
//         System.out.println("T6: " + findSecondLargest(exampleArray));
//         System.out.println("T7: " + containsNumber(exampleArray, 8));
//         System.out.println("T8: " + Arrays.toString(replaceNegativesWithZero(exampleArray)));
//         System.out.println("T9: " + findFirstIndex(exampleArray, 2));
         System.out.println("T10: " + hasNoDuplicates(exampleArray));

    }
}
