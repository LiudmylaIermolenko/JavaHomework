package org.asd._05_12_2024.taski2;

public class ArrayTasksWithStringsAndInts {

    // 21. Генерация нового массива из четных чисел.
    public static void task21() {
        int[] array = {1, 2, 3, 4, 5, 6};
        // Сначала посчитаем, сколько чётных чисел в массиве
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  // Проверка, чётное ли число
                countEven++;
            }
        }

        // Создаём новый массив для чётных чисел
        int[] evenArray = new int[countEven];
        int index = 0;

        // Добавляем чётные числа в новый массив
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  // Если число чётное
                evenArray[index] = array[i];
                index++;
            }
        }

        // Выводим новый массив
        System.out.print("Массив из чётных чисел: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }

    // 22. Генерация нового массива из нечетных чисел.
    public static void task22() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        int[] oddArray = new int[countOdd];
        int index = 0;

        // Добавляем нечётные числа в новый массив
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {  // Если число нечётное
                oddArray[index] = array[i];
                index++;
            }
        }
        // Выводим новый массив
        System.out.print("Массив из нечётных чисел: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }

    // 23. Проверка на палиндром в массиве строк.
    public static void task23() {
        String[] array = {"level", "hello", "radar", "world"};
        // Перебираем каждую строку в массиве
        for (String str : array) {
            // Проверяем, является ли строка палиндромом
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }

    // Метод для проверки на палиндром
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Проверяем символы с двух сторон строки
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Если символы не равны, строка не палиндром
            }
            left++;
            right--;
        }

        return true; // Если все символы совпали, строка палиндром
    }

    // 25. Создание массива чисел с четными индексами.
    public static void task25() {
        int[] array = {1, 2, 3, 4, 5, 6};
        // Шаг 1: Считаем количество элементов с чётными индексами
        int countEvenIndexes = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {  // Проверяем, чётный ли индекс
                countEvenIndexes++;
            }
        }

        // Шаг 2: Создаём новый массив для элементов с чётными индексами
        int[] evenIndexArray = new int[countEvenIndexes];
        int index = 0;

        // Шаг 3: Заполняем новый массив
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {  // Если индекс чётный
                evenIndexArray[index] = array[i];
                index++;
            }
        }

        // Шаг 4: Выводим новый массив
        System.out.print("Массив чисел с чётными индексами: ");
        for (int i = 0; i < evenIndexArray.length; i++) {
            System.out.print(evenIndexArray[i] + " ");
        }
    }

    // 26. Создание массива чисел с нечетными индексами.
    public static void task26() {
        int[] array = {1, 2, 3, 4, 5, 6};
        // Шаг 1: Считаем количество элементов с нечётными индексами
        int countOddIndexes = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {  // Проверяем, нечётный ли индекс
                countOddIndexes++;
            }
        }

        // Шаг 2: Создаём новый массив для элементов с нечётными индексами
        int[] oddIndexArray = new int[countOddIndexes];
        int index = 0;

        // Шаг 3: Заполняем новый массив
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {  // Если индекс нечётный
                oddIndexArray[index] = array[i];
                index++;
            }
        }

        // Шаг 4: Выводим новый массив
        System.out.print("Массив чисел с нечётными индексами: ");
        for (int i = 0; i < oddIndexArray.length; i++) {
            System.out.print(oddIndexArray[i] + " ");
        }

    }

    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
    public static void task27() {
        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        // Шаг 1: Подсчитываем количество строк с чётной и нечётной длиной
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Шаг 2: Создаём массивы для строк с чётной и нечётной длиной
        String[] evenLengthArray = new String[evenCount];
        String[] oddLengthArray = new String[oddCount];

        // Шаг 3: Заполняем массивы
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0) {
                evenLengthArray[evenIndex] = array[i];
                evenIndex++;
            } else {
                oddLengthArray[oddIndex] = array[i];
                oddIndex++;
            }
        }

        // Шаг 4: Выводим массивы
        System.out.print("Строки с чётной длиной: ");
        for (int i = 0; i < evenLengthArray.length; i++) {
            System.out.print(evenLengthArray[i] + " ");
        }

        System.out.println(); // Для перехода на новую строку

        System.out.print("Строки с нечётной длиной: ");
        for (int i = 0; i < oddLengthArray.length; i++) {
            System.out.print(oddLengthArray[i] + " ");
        }
    }

    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
    public static void task28() {
        String[] array = {"apple", "banana", "level", "radar", "hello"};
        System.out.println("Строки, которые начинаются и заканчиваются одинаковой буквой:");
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            // Проверяем первую и последнюю буквы строки
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                System.out.println(str);
            }
        }

    }

    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
    public static void task29() {
        int[] array = {1, 2, 3, 4, 5};

//        for (int num : array) {
//            System.out.print((num * num) + " ");
//        }
        // Создаём новый массив для квадратов
        int[] squaredArray = new int[array.length];

        // Заполняем новый массив квадратами элементов исходного массива
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }

        // Выводим новый массив
        System.out.print("Массив квадратов элементов: ");
        for (int i = 0; i < squaredArray.length; i++) {
            System.out.print(squaredArray[i] + " ");
        }

    }

    // 30. Создать массив строк, содержащих только уникальные символы.
    public static void task30() {
        String[] array = {"apple", "banana", "cat", "dog", "race"};
        // Подсчитаем количество строк с уникальными символами
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (hasUniqueCharacters(array[i])) {
                uniqueCount++;
            }
        }

        // Создаём массив для строк с уникальными символами
        String[] uniqueStrings = new String[uniqueCount];
        int index = 0;

        // Заполняем массив
        for (int i = 0; i < array.length; i++) {
            if (hasUniqueCharacters(array[i])) {
                uniqueStrings[index] = array[i];
                index++;
            }
        }

        // Выводим результат
        System.out.print("Строки с уникальными символами: ");
        for (int i = 0; i < uniqueStrings.length; i++) {
            System.out.print(uniqueStrings[i] + " ");
        }
    }

    // Метод для проверки, содержит ли строка только уникальные символы
    public static boolean hasUniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false; // Если символы повторяются, строка не уникальна
                }
            }
        }
        return true; // Если ни один символ не повторяется
    }
    public static void main(String[] args) {
        task30();
    }
}