package org.asd._05_12_2024.taski2;

public class ArrayTasksWithStringsAndIntsA {

    // 1. Найти сумму элементов массива целых чисел.
    public static void task1() {

        int[] array = {1, 2, 3, 4};
        int sum = 0; // Переменная для хранения суммы

        // Используем цикл для сложения элементов
//        for (int num : array) {
//            sum += num;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Выводим результат
        System.out.println("Сумма элементов массива: " + sum);
    }


    // 2. Найти длину самой длинной строки в массиве строк.
    public static void task2() {

        String[] array = {"cat", "elephant", "dog"};
        int maxLength = 0; // Переменная для хранения максимальной длины

        // Используем цикл для проверки длины каждой строки
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length(); // Обновляем максимальную длину
            }
        }

        // Выводим результат
        System.out.println("Длина самой длинной строки: " + maxLength);
    }


    // 3. Проверить, содержит ли массив строк заданное слово.
    public static void task3() {
        String[] array = {"apple", "banana", "cherry"};
        String target = "banana";

        boolean found = false; // Флаг для проверки

        // Перебираем массив
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) { // Сравниваем строку с target
                found = true;
                break; // Достаточно найти один раз
            }
        }

        // Выводим результат
        if (found) {
            System.out.println("Массив содержит слово: " + target);
        } else {
            System.out.println("Массив не содержит слово: " + target);
        }

    }

    // 4. Подсчитать количество строк, содержащих заданный символ.
    public static void task4() {
        String[] array = {"apple", "banana", "cherry"};
        char target = 'a';
        int count = 0; // Счётчик строк

        // Перебираем массив
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(String.valueOf(target))) { // Проверяем, содержит ли строка символ
                count++;
            }
        //Или так:
//                for (int i = 0; i < array.length; i++) {
//                    // Проверяем каждый символ строки
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == target) {
//                    count++;
//                    break;
//                }
//            }
            //Или так:
//                for (int i = 0; i < array.length; i++) {
//                    if (array[i].contains("" + target)) {
//                        System.out.println("Строка \"" + array[i] + "\" содержит символ '" + target + "'");
//                    }

        }


        // Вывод результата
        System.out.println("Количество строк, содержащих символ '" + target + "': " + count);
    }


    // 5. Найти строку с максимальным количеством символов 'e'.
    public static void task5() {
        String[] array = {"elephant", "eagle", "dog"};
        String maxString = "";
        int maxCount = 0;
        // Перебираем массив строк
        for (int i = 0; i < array.length; i++) {
            String str = array[i];  // Текущая строка
            int count = 0;          // Счётчик символов 'e' в текущей строке

            // Перебираем каждый символ в строке
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'e') {
                    count++; // Увеличиваем счётчик, если символ 'e' найден
                }
            }

            // Если текущее количество 'e' больше максимального, обновляем
            if (count > maxCount) {
                maxCount = count;
                maxString = str;
            }
        }

        // Выводим строку с максимальным количеством символов 'e'
        System.out.println("Строка с максимальным количеством символов 'e': " + maxString);
        System.out.println("Количество символов 'e': " + maxCount);
    }


    // 6. Удалить из массива строк все строки, содержащие заданное слово.
    public static void task6() {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        // Считаем количество строк, которые не содержат target
        int newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(target)) {
                newSize++;
            }
        }

        // Создаём новый массив нужного размера
        String[] resultArray = new String[newSize];

        // Переносим строки, которые не содержат target, в новый массив
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(target)) {
                resultArray[index++] = array[i];
            }
        }

        // Вывод результата
        System.out.println("Массив после удаления строк, содержащих '" + target + "':");
        for (String str : resultArray) {
            System.out.println(str);
//            for (int i = 0; i < resultArray.length; i++) {
//                System.out.println(resultArray[i]);
//            }
        }

    }

    // 7. Найти минимальный элемент массива целых чисел.
    public static void task7() {
        int[] array = {3, 1, 4, 1, 5};
        // Инициализируем минимальный элемент первым элементом массива
        int min = array[0];

        // Перебираем массив, начиная со второго элемента
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Обновляем минимальный элемент
            }
        }

        // Вывод результата
        System.out.println("Минимальный элемент массива: " + min);
    }



    // 8. Найти строку с минимальной длиной.
    public static void task8() {
        String[] array = {"cat", "elephant", "do"};
        // Инициализируем минимальную строку первой строкой массива
        String minString = array[0];

        // Перебираем массив, начиная со второго элемента
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < minString.length()) {
                minString = array[i]; // Обновляем минимальную строку
            }
        }

        // Вывод результата
        System.out.println("Строка с минимальной длиной: " + minString);
    }



    // 9. Подсчитать количество четных чисел в массиве.
    public static void task9() {
        int[] array = {1, 2, 3, 4, 5};
        int count = 0; // Счётчик чётных чисел

        // Перебираем массив
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Проверяем, является ли число чётным
                count++;
            }
        }

        // Вывод результата
        System.out.println("Количество чётных чисел в массиве: " + count);
    }



    // 10. Найти строку, которая встречается чаще всего.
    public static void task10() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
        String mostFrequent = "";
        int maxCount = 0;
        // Внешний цикл перебирает строки
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            // Внутренний цикл считает количество вхождений текущей строки
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }

            // Обновляем наиболее частую строку, если текущая встречается чаще
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = array[i];
            }
        }

        // Вывод результата
        System.out.println("Строка, которая встречается чаще всего: " + mostFrequent);
        System.out.println("Количество вхождений: " + maxCount);
    }

    public static void main(String[] args) {
        task10();
    }
}

