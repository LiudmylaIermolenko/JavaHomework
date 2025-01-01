package org.asd._19_12_2024;

import java.util.Arrays;
import java.util.Random;

public class T5 {


    /**
     * 1. Напишите метод, который принимает массив целых чисел и возвращает все подмассивы длиной 2.
     */
    public static int[][] generateSubArrays(int[] array) {
        int[][] subArrays = new int[array.length - 1][2]; // Массив для подмассивов
        for (int i = 0; i < array.length - 1; i++) {
            subArrays[i][0] = array[i];
            subArrays[i][1] = array[i + 1];
        }

        return subArrays;
    }



    /**
     * 2. Напишите метод, который принимает массив целых чисел и возвращает true, если массив является палиндромом.
     */
    public static boolean isArrayPalindrome(int[] array) {
        int start = 0;
        int end = array.length-1;
//        while (start < end) {
//            if (array[start] != array[end]) {
//                return false; // Найдено несовпадение, массив не палиндром
//            }
//            start++;
//            end--;
//        }
        for (int i = 0; i < array.length; i++) {
//            for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            if (array[start] != array[end] &&  start < end) {
                return  false;
            }
            start++;
            end--;

        }
        return true;
    }

    /**
     * 3. Напишите метод, который принимает массив целых чисел и возвращает самый часто встречающийся элемент.
     */
    public static int findMostFrequentElement(int[] array) {
        int mostFrequent = array[0];
        int maxFrequency = 0;

        // Перебираем каждый элемент массива
        for (int i = 0; i < array.length; i++) {
            int currentFrequency = 0;

            // Подсчитываем количество вхождений текущего элемента
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    currentFrequency++;
                }
            }

            // Обновляем самый частый элемент, если текущая частота больше
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequent = array[i];
            }
        }

        return mostFrequent;
    }

    /**
     * 4. Напишите метод, который принимает массив целых чисел и
     * сортирует его без использования встроенных методов сортировки.
     */
    public static int[] sortArrayManually(int[] array) {

        for (int i = 0; i < array.length - 1; i++) { // Внешний цикл для проходов
            for (int j = 0; j < array.length - 1; j++) { // Внутренний цикл для сравнения соседних элементов
                if (array[j] > array[j + 1]) {
                    // Меняем местами элементы
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    /**
     * 5. Напишите метод, который принимает массив целых чисел и
     * переставляет элементы массива в случайном порядке.
     */
    public static int[] shuffleArray(int[] array) {
       Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(i, array.length); // Генерируем случайный индекс i до array.length-1
//            for (int i = array.length - 1; i > 0; i--) {
//                // Генерируем случайный индекс от 0 до i
//                int j = rand.nextInt(i + 1);
            // Обмениваем элементы array[i] и array[j]
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }

    /**
     * 6. Напишите метод, который принимает массив целых
     * чисел и возвращает новый массив с уникальными элементами.
     */
    public static int[] removeDuplicates(int[] array) {
        int uniqueCount = 0;

        // Сначала определяем количество уникальных элементов
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        // Создаем массив для хранения уникальных элементов
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;

        // Заполняем массив уникальными элементами
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[index++] = array[i];
            }
        }

        return uniqueArray;
    }

    /**
     * 7. Напишите метод, который принимает массив целых
     * чисел и возвращает его циклически сдвинутым вправо на k позиций.
     */
    public static int[] rotateArrayRight(int[] array, int k) {
        if (array == null || array.length == 0 || k <= 0) {
            return array;
        }

        int n = array.length;
        k = k % n; // Убираем полные циклы, если k больше длины массива
//
        // Создаем новый массив для результата
        int[] rotatedArray = new int[n];

        // Копируем последние k элементов в начало нового массива вручную
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = array[n - k + i];
        }

        // Копируем первые (n - k) элементов в оставшуюся часть вручную
        for (int i = k; i < n; i++) {
            rotatedArray[i] = array[i - k];
        }

        return rotatedArray;
    }

    /**
     * 8. Напишите метод, который принимает два массива
     * целых чисел и возвращает их пересечение.
     */
    public static int[] findArrayIntersection(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length == 0 || array2.length == 0) {
            return new int[0];
        }

        // Определяем максимальную длину пересечения (минимум из длин массивов)
        int maxLength = Math.min(array1.length, array2.length);
        int[] tempIntersection = new int[maxLength];
        int index = 0;

        // Сортируем массивы для упрощения поиска
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                // Добавляем элемент в пересечение, если совпадает
                if (index == 0 || tempIntersection[index - 1] != array1[i]) {
                    tempIntersection[index++] = array1[i];
                }
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Копируем результат в массив нужного размера
        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = tempIntersection[k];
        }

        return result;
    }

    /**
     * 9. Напишите метод, который принимает массив целых чисел и
     * возвращает true, если в массиве есть дублирующиеся элементы.
     */
    public static boolean hasDuplicates(int[] array) {
        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            // Сравниваем текущий элемент с каждым последующим
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    // Если нашли дубликат, возвращаем true
                    return true;
                }
            }
        }

        // Если дубликатов не найдено
        return false;
    }

    /**
     * 10. Напишите метод, который принимает массив целых чисел и
     * возвращает максимальную сумму подмассива (алгоритм Кадане).
     */
    public static int maxSubarraySum(int[] array) {
        // Если массив пустой, возвращаем 0
        if (array.length == 0) {
            return 0;
        }

        // Инициализация переменных
        int currentSum = array[0];
        int maxSum = array[0];

        // Проходим по массиву начиная со второго элемента
        for (int i = 1; i < array.length; i++) {
            // Выбираем большее из двух вариантов: добавить текущий элемент или начать новый подмассив
            currentSum = Math.max(array[i], currentSum + array[i]);

            // Обновляем максимальную сумму, если текущая сумма больше
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
         int[] exampleArray = {1, 2, 3, 2, 1};
//         System.out.println(Arrays.deepToString(generateSubArrays(exampleArray)));
//         System.out.println(isArrayPalindrome(exampleArray));
//         System.out.println(findMostFrequentElement(exampleArray));
//         System.out.println(Arrays.toString(sortArrayManually(exampleArray)));
//         System.out.println(Arrays.toString(shuffleArray(exampleArray)));
//         System.out.println(Arrays.toString(removeDuplicates(exampleArray)));
//         System.out.println(Arrays.toString(rotateArrayRight(exampleArray, 2)));
//        int[] array1 = {1, 2, 3, 4, 2};
//        int[] array2 = {2, 4, 4, 6};
//         System.out.println(Arrays.toString(findArrayIntersection(exampleArray, exampleArray)));
//         System.out.println(hasDuplicates(array1));
         System.out.println(maxSubarraySum(exampleArray));
    }
}