package org.asd._03_12_2024;

import java.util.Arrays;

public class ArrayTasksExtended {

    // 16. Найти все пары элементов, сумма которых равна заданному числу.
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    if (i != j)
                        System.out.println(array[i] + " , " + array[j]);
                }

            }

        }

    }


    // 17. Проверить, есть ли в массиве дубликаты.
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    hasDuplicates = true;
                    break;

                }
            }


        }
        if (hasDuplicates) {
            System.out.println("В массиве есть дубликаты.");
        } else {
            System.out.println("В массиве нет дубликатов.");
        }
    }


    // 18. Удалить все нули из массива и сдвинуть элементы влево.
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZero++;
            }
        }
        int[] newArray = new int[array.length - countZero];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }


    // 20. Найти количество чисел, делящихся на заданное число без остатка.
    public static void task20() {
        int[] array = {10, 15, 23, 25, 30};
        int divisor = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                count++;
            }

        }
        System.out.println(count);
    }

    // 21. Упорядочить массив по возрастанию.
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};

//        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(array));
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

    // 22. Найти индекс первого отрицательного элемента.
    public static void task22() {
        int[] array = {1, 2, 3, 4, -5};
        int negativeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeIndex = i;
                break;
            }

        }
        System.out.println(negativeIndex);
    }

    // 23. Подсчитать сумму чисел на четных индексах.
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    // 24. Найти произведение всех элементов массива.
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        System.out.println(result);
    }

    // 25. Переместить все отрицательные числа в конец массива.
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] < 0 && array[j + 1] > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));

    }


    // 26. Найти количество уникальных элементов в массиве.
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;// Найдено совпадение
                    break;
                }
            }

                // Если элемент уникален, увеличиваем счётчик
                if (isUnique) {
                    count++;
                }
            }
        System.out.println(count);
    }

    // 27. Переставить минимальный элемент массива в начало.
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};
        int minInd = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minInd]) {
                minInd = i;
            }
        }
            int temp = array[0];
            array[0] = array[minInd];
            array[minInd] = temp;

        System.out.println(Arrays.toString(array));
    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов.
    public static void task28() {
        int[] array = {1, 1, 2, 2, 3, 3, 3};
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;

                }
                currentLength = 1;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        System.out.println(maxLength);
    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};
        int sum = 0;
        boolean foundFirstNegative = false;
        for (int i = 0; i < array.length; i++) {
            if (!foundFirstNegative && array[i] < 0) {
                foundFirstNegative = true;
            } else if (foundFirstNegative && array[i] > 0) {
                    sum += array[i];
            }

        }
        System.out.println(sum);
    }

    // 30. Удалить все дубликаты из массива.
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int countDuplicates = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    countDuplicates++;
                }
            }
        }
        int[] newArray = new int[array.length - countDuplicates];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[j] == array[i])
                    break;
                if (j == newArray.length - 1) {
                    newArray[k] = array[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));


    }

    public static void main(String[] args) {
        task30();
    }
}