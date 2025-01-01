package org.asd._19_12_2024;

import java.util.Arrays;
import java.util.Objects;

public class T6 {
    /**
     * 1. Напишите метод, который принимает массив строк и возвращает его длину.
     */
    public static int getArrayLength(String[] array) {

        return array.length;
    }

    /**
     * 2. Напишите метод, который принимает массив строк и выводит его элементы в консоль.
     */
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    /**
     * 3. Напишите метод, который принимает массив строк и возвращает первую строку.
     */
    public static String getFirstElement(String[] array) {
        if (array != null && array.length > 0) {
            return array[0];
        }
        // Если массив пустой или null, возвращаем пустую строку
        return "";
    }

    /**
     * 4. Напишите метод, который принимает массив строк и возвращает последнюю строку.
     */
    public static String getLastElement(String[] array) {
        if (array != null && array.length > 0) {
            return array[array.length-1];
        }
        return "";
    }

    /**
     * 5. Напишите метод, который принимает массив строк и возвращает массив строк в обратном порядке.
     */
    public static String[] reverseArray(String[] array) {
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
         reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }

    /**
     * 6. Напишите метод, который принимает массив строк и возвращает длину самой длинной строки.
     */
    public static int getLongestStringLength(String[] array) {
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].length() > maxLength) {
                maxLength = array[i].length();
            }
        }
        return maxLength;
    }

    /**
     * 7. Напишите метод, который принимает массив строк и возвращает строку с максимальной длиной.
     */
    public static String getLongestString(String[] array) {
        String longestString = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].length() > longestString.length()) {
             longestString = array[i];
            }

        }
        return longestString;
    }

    /**
     * 8. Напишите метод, который принимает массив строк и возвращает true, если массив содержит заданную строку.
     */
    public static boolean containsString(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null && array[i] == target) {
            if (array[i] != null && array[i].equals(target)) {
                return  true;

            }

        }
        return false;
    }

    /**
     * 9. Напишите метод, который принимает массив строк и возвращает количество строк, которые начинаются с заданной буквы.
     */
    public static int countStringsStartingWith(String[] array, char letter) {
        if (array == null || array.length == 0) {
            return 0; // Возвращаем 0, если массив пустой или равен null
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i].charAt(0) == letter) {
                    //if (array[i].charAt(0) == letter || array[i].charAt(0) == Character.toUpperCase(letter) || array[i].charAt(0) == Character.toLowerCase(letter)) {
                    count++;

            }

        }
        return count;
    }

    /**
     * 10. Напишите метод, который принимает массив строк и возвращает массив строк в верхнем регистре.
     */
    public static String[] convertToUpperCase(String[] array) {
        // Создаем новый массив для хранения строк в верхнем регистре
        String[] upperCaseArray = new String[array.length];

        // Проходим по каждому элементу массива и преобразуем его в верхний регистр
        for (int i = 0; i < array.length; i++) {
                upperCaseArray[i] = array[i].toUpperCase(); // Преобразуем строку в верхний регистр
        }
        return upperCaseArray; // Возвращаем новый массив
    }

    public static void main(String[] args) {
        // Пример вызовов методов (после их реализации)
         String[] exampleArray = {"apple", "banana", "cherries"};
//         System.out.println("T1: " + getArrayLength(exampleArray));
//         printArray(exampleArray);// T2
//        System.out.println("T2: " + Arrays.toString(exampleArray));
//        System.out.println("T3: " + getFirstElement(exampleArray));
//        System.out.println("T4: " + getLastElement(exampleArray));
        //String[] array2 = {};
        //System.out.println("T5: " + Arrays.toString(reverseArray(exampleArray)));
//        System.out.println("T6: " + getLongestStringLength(exampleArray));
//        System.out.println("T7: " + getLongestString(exampleArray));
//        System.out.println("T8: " + containsString(exampleArray, "apples"));
        System.out.println("T9: " + countStringsStartingWith(exampleArray,  'a'));
        System.out.println("T10: " + Arrays.toString(convertToUpperCase(exampleArray)));
    }
}
