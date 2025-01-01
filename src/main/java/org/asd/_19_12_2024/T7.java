package org.asd._19_12_2024;

import java.util.Arrays;

public class T7 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает массив строк, отсортированный в лексикографическом порядке.
     */
    public static String[] sortArray(String[] array) {
        // Реализация сортировки пузырьком
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0) { // Сравнение строк
                    // Меняем местами, если текущая строка больше следующей
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= tmp;
                }

            }
        }
        return array;
    }

    /**
     * 2. Напишите метод, который принимает массив строк и возвращает самую часто встречающуюся строку.
     */
    public static String findMostFrequentString(String[] array) {
        if (array == null || array.length == 0) {
            return ""; // Возвращаем пустую строку, если массив пустой
        }

        String mostFrequent = array[0]; // Берём первый элемент как начальное значение
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    count++;
                }

            }
            if(count > maxCount){
                maxCount = count;
                mostFrequent = array[i];
            }

        }

        return mostFrequent;
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает массив только уникальных строк.
     */
    public static String[] getUniqueStrings(String[] array) {
        String[] temp = new String[array.length];
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            // Проверяем, встречалась ли текущая строка ранее
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    isUnique = false;
                    break;
                }

            }

            // Если строка уникальна, добавляем её в массив temp
            if (isUnique) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }
        // Создаём итоговый массив точного размера
        String[] uniqueStrings = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueStrings[i] = temp[i];
        }


        return uniqueStrings;
    }

    /**
     * 4. Напишите метод, который принимает два массива строк и возвращает массив строк, которые присутствуют в обоих массивах.
     */
    public static String[] findCommonStrings(String[] array1, String[] array2) {

        return new String[0];
    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк, которые являются палиндромами.
     */
    public static String[] findPalindromes(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 6. Напишите метод, который принимает массив строк и удаляет строки, содержащие заданное слово.
     */
    public static String[] removeStringsContainingWord(String[] array, String word) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с наибольшим количеством гласных.
     */
    public static String findStringWithMostVowels(String[] array) {
        // TODO: реализовать метод
        return "";
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает массив строк, содержащих только буквы (без цифр или специальных символов).
     */
    public static String[] filterAlphabeticStrings(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает массив строк, где каждая строка перевернута (reverse).
     */
    public static String[] reverseEachString(String[] array) {
        // TODO: реализовать метод
        return new String[0];
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк, сгруппированных по их длине (каждая группа отдельный элемент массива).
     */
    public static String[][] groupStringsByLength(String[] array) {
        // TODO: реализовать метод
        return new String[0][0];
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
         String[] exampleArray = {"apple", "banana", "radar", "123", "apple", "level"};
//         System.out.println("T1: " + Arrays.toString(sortArray(exampleArray)));
//         System.out.println("T2: " + findMostFrequentString(exampleArray));
         System.out.println("T3: " + Arrays.toString(getUniqueStrings(exampleArray)));
    }
}
