package org.asd._05_12_2024.taski2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "do"};
        // Пузырьковая сортировка по длине строки
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // Сравниваем длину текущей строки и следующей
                if (array[j].length() > array[j + 1].length()) {
                    // Меняем местами строки, если текущая строка длиннее следующей
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Выводим отсортированный массив
        System.out.println("Массив строк, отсортированный по длине:");
        for (String str : array) {
            System.out.println(str);
        }
        //for (int i = 0; i < array.length; i++) {
        //    System.out.println(array[i]);
        //}
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        // Перебираем массив, чтобы найти все строки одинаковой длины
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Если длина строк одинаковая, выводим их
                if (array[i].length() == array[j].length()) {
                    System.out.println("Строки одинаковой длины: " + array[i] + ", " + array[j]);
                }
            }
        }

    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        // Сравниваем массивы
        if (Arrays.equals(array1, array2)) {
            System.out.println("Массивы одинаковы.");
        } else {
            System.out.println("Массивы разные.");
        }
    }
    // Проверяем длину массивов
    //        if (array1.length != array2.length) {
    //            System.out.println("Массивы разные.");
    //        } else {
    //            boolean areEqual = true;
    //            for (int i = 0; i < array1.length; i++) {
    //                if (array1[i] != array2[i]) {
    //                    areEqual = false;
    //                    break;
    //                }
    //            }
    //
    //            if (areEqual) {
    //                System.out.println("Массивы одинаковы.");
    //            } else {
    //                System.out.println("Массивы разные.");
    //            }
    //        }


    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        // Убедимся, что массивы одинаковой длины
        if (array1.length != array2.length) {
            System.out.println("Массивы разных длин, суммировать нельзя.");
            return;
        }

        // Создаём новый массив для хранения суммы
        int[] sumArray = new int[array1.length];

        // Перебираем элементы и суммируем соответствующие элементы
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Выводим результат
        System.out.print("Новый массив с суммами элементов: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }




    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        // Создаем ArrayList без указания типа данных
        ArrayList uniqueList = new ArrayList();

        // Перебираем массив строк
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            // Проверяем, встречалась ли эта строка ранее
            for (int j = 0; j < uniqueList.size(); j++) {
                if (array[i].equals(uniqueList.get(j))) {
                    isUnique = false;
                    break; // Строка уже есть в списке
                }
            }

            // Если строка уникальна, добавляем её в список
            if (isUnique) {
                uniqueList.add(array[i]);
            }
        }

        // Выводим уникальные строки, используя toString()
        System.out.println("Уникальные строки: " + uniqueList.toString());


    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        // Массив для хранения уникальных строк
        String[] uniqueArray = new String[array.length];
        int uniqueCount = 0;

        // Перебираем исходный массив
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            // Проверяем, встречалась ли эта строка ранее в uniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i].equals(uniqueArray[j])) {
                    isUnique = false;  // Строка уже есть в uniqueArray
                    break;
                }
            }

            // Если строка уникальна, добавляем её в uniqueArray
            if (isUnique) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Выводим уникальные строки
        System.out.println("Массив без дубликатов:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueArray[i]);
        }
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        // Создаем новый массив, размер которого равен сумме длин двух массивов
        String[] array3 = new String[array1.length + array2.length];

        // Копируем элементы из первого массива в mergedArray
        int index = 0;  // Индекс для mergedArray
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array1[i];
            index++;
        }

        // Копируем элементы из второго массива в mergedArray
        for (int i = 0; i < array2.length; i++) {
            array3[index] = array2[i];
            index++;
        }
        // Выводим результат с использованием обычного цикла for
        System.out.println("Объединённый массив:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
        // Перебираем массив и проверяем, упорядочен ли он
        boolean isSorted = true;  // Изначально считаем, что массив отсортирован
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                isSorted = false;  // Если текущая строка больше следующей, массив не отсортирован
                break;
            }
        }

        // Выводим результат
        if (isSorted) {
            System.out.println("Массив отсортирован по алфавиту.");
        } else {
            System.out.println("Массив не отсортирован по алфавиту.");
        }
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
        // Используем обычный цикл for с индексами для перебора массива
        for (int i = 0; i < array.length; i++) {
            // Проверяем, начинается ли строка с буквы target
            if (array[i].charAt(0) == target) {
                System.out.println(array[i]);  // Выводим строку, если она начинается с target
            }
        }
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        // Создаём новый массив строк, размер которого равен размеру исходного массива
        String[] firstLettersArray = new String[array.length];

        // Перебираем массив и извлекаем первые буквы
        for (int i = 0; i < array.length; i++) {
            firstLettersArray[i] = String.valueOf(array[i].charAt(0)); // Берём первую букву и преобразуем её в строку
        }
        // Выводим новый массив с использованием обычного цикла for
        System.out.println("Массив с первыми буквами:");
        for (int i = 0; i < firstLettersArray.length; i++) {
            System.out.println(firstLettersArray[i]);  // Выводим элемент по индексу
        }
    }
    public static void main(String[] args) {
        task20();
    }
}