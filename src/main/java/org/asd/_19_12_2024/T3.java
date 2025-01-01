package org.asd._19_12_2024;

import java.util.Arrays;

public class T3 {

    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает его длину.
     */
    public static int getArrayLength(int[] array) {


        return array.length;
    }

    /**
     * 2. Напишите метод, который принимает массив целых чисел и выводит его элементы в консоль.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();// Печатаем новую строку после вывода всех элементов
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает сумму его элементов.
     */
    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * 4. Напишите метод, который принимает массив целых чисел и возвращает максимальный элемент.
     */
    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и возвращает минимальный элемент.
     */
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * 6. Напишите метод, который принимает массив целых чисел и возвращает
     * новый массив, содержащий только чётные элементы.
     */
    public static int[] filterEvenNumbers(int[] array) {
        int count = 0;// Считаем количество чётных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;// Увеличиваем счётчик чётных чисел
            }
        }
        int[] evenNumber = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumber[index++] = array[i];
            }
        }
        return evenNumber;
    }

    /**
     * 7. Напишите метод, который принимает массив целых чисел и
     * возвращает массив в обратном порядке.
     */
    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[index++] = array[i];
        } //Копирование элементов: В каждой итерации цикла текущий элемент из исходного массива добавляется в новый массив на позицию index, которая увеличивается после каждой итерации.
        return reverseArray;
    }

    /**
     * 8. Напишите метод, который принимает массив целых чисел и возвращает true,
     * если массив отсортирован по возрастанию.
     */
    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false; // Если текущий элемент больше следующего, массив не отсортирован
            }
        }
        return true; // Если не найдено нарушений порядка, массив отсортирован
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и возвращает
     * среднее арифметическое его элементов.
     */
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        int sum = 0; //цикл for для подсчета суммы элементов массива
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        // Считаем сумму элементов массива
        for (int num : array) {
            sum += num; //цикл for-each для подсчета суммы всех элементов массива.
        }
        //среднее арифметическое (сумма / количество элементов)
        return (double) sum / array.length;//Преобразуем сумму к типу double, чтобы результатом мог быть нецелый результат.
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает количество чётных чисел в массиве.
     */
    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
        int[] exampleArray = {1, 2, 3, 4, 5};
//        System.out.println("T1: " + getArrayLength(exampleArray));
//        System.out.println("Длина массива: " + exampleArray.length); // Прямое использование свойства length
//        printArray(exampleArray); /T2
//        System.out.println("T3: " + sumArrayElements(exampleArray));
//        System.out.println("T4: " + findMaxElement(exampleArray));
//        System.out.println("T5: " + findMinElement(exampleArray));
//        System.out.println("T6: " + Arrays.toString(filterEvenNumbers(exampleArray)));
//        int[] evenArray = filterEvenNumbers(exampleArray); // Вызов метода для фильтрации чётных чисел
//        System.out.print("T6.1: Чётные числа: ");
////        for (int num : evenArray) {
////            System.out.print(num + " "); //for-ich
//            for (int i = 0; i < evenArray.length; i++) {
//                System.out.print(evenArray[i] + " ");
//        System.out.println("T7: " + Arrays.toString(reverseArray(exampleArray)));
//        int[] exampleArray1 = {1, 7, 3, 4, 5};
//        System.out.println("t8: " + isArraySorted(exampleArray1));
        System.out.println("T9:Среднее арифметическое: " + calculateAverage(exampleArray));
        System.out.println("T10:Количество чётных чисел: " + countEvenNumbers(exampleArray));

    }
}

