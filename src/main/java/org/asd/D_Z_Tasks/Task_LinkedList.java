package org.asd.D_Z_Tasks;

import java.util.*;

public class Task_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann"));
        System.out.println(findShortestString(strings));
        System.out.println(joinStrings(strings));
//        String result = joinStrings(strings);
//        System.out.println(result);
        System.out.println(reverseList(strings));
//        List<String> reversedList = reverseList(strings);
//        System.out.println("Список в обратном порядке: " + reversedList);
        List<String> duplicates = findDuplicates(strings);
        System.out.println("Дубликаты: " + duplicates);

        //for Integer:
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        System.out.println("Список: " + list);
        int element = 3;
        int[] indices = getFirstAndLastOccurrence(list, element);
        System.out.println("Первое вхождение: " + indices[0]);
        System.out.println("Последнее вхождение: " + indices[1]);

        System.out.println(reverseListInt(list));

    }

    //Перебрать LinkedList и найти самую короткую строку.
    public static String findShortestString(LinkedList<String> list) { // Теперь принимает LinkedList<String>
        if (list.isEmpty()) {
            return null;
        }
        String shortest = list.getFirst(); // getFirst() работает только с LinkedList

        for (String str : list) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        return shortest;
    }

    //Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
//    public static String joinStrings(List<String> list) {
//        return String.join("|", list);
//    }
    public static String joinStrings(List<String> list) {
        if (list.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (String str : list) {
            if (result.length() > 0) { //if (!result.isEmpty()) {
                result.append("|");
            }
            result.append(str);
        }

        return result.toString();
    }

    //element = 2 output: 3 (индекс первого вхождения), 6 (индекс последнего вхождения)
// Метод для поиска первого и последнего вхождения элемента в LinkedList
    public static int[] getFirstAndLastOccurrence(LinkedList<Integer> list, int element) {

        int firstIndex = -1;
        int lastIndex = -1;
        int index = 0;
        for (int value : list) {
            if (value == element) {
                if (firstIndex == -1) {
                    firstIndex = index;
                }
                lastIndex = index;
            }
            index++;
        }
        return new int[]{firstIndex, lastIndex};
    }

    //Имеется лист. Написать метод, возвращающий этот же лист,
    //в котором элементы расположены в обратном порядке.
    public static List<String> reverseList(List<String> list) {
        List<String> reversed = new LinkedList<>();
//        for (int i = list.size() - 1; i >= 0; i--) {
//            reversed.add(list.get(i));
//        }
        for (String str : list) {
            reversed.add(0, str);  // Это эквивалентно addFirst() в LinkedList
        }
        return reversed;
    }
    public static List<Integer> reverseListInt(List<Integer> list) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> findDuplicates(List<String> list) {
        Set<String> seen = new HashSet<>();  // Храним элементы, которые уже встретились
        Set<String> duplicates = new HashSet<>(); // Храним дубликаты

        for (String str : list) {
            if (!seen.add(str)) { // Если элемент не удалось добавить (он уже существует в set 'seen'), значит это дубликат
                duplicates.add(str);
            }
        }

        return new ArrayList<>(duplicates); // Преобразуем Set в List и возвращаем
    }

    //Проверить, содержит ли List<String> заданную строку и вернуть ее индекс. Если строка не найдена,
    // вернуть -1.

}


//Создать LinkedList с объектами вашего собственного класса и
// удалить все элементы, удовлетворяющие определенному условию.

//Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
//
//
//
//Проверить, содержит ли List<String> хотя бы одну строку, которая начинается с заданного префикса.
//
//
//
//Получить все возможные комбинации из Set<String> и Set<Integer>, где каждая комбинация представляет собой строку и число, объединенные вместе.
//
//
//
//Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое Вывести все четные числа Получить список всех чисел в обратном порядке Получить список всех чисел меньше 7
//
//
//
//Создать класс Point для хранения координат (x, y) точки на плоскости. Создать список точек, отсортировать по координате y. Создать TreeSet со всеми уникальными точками. Создать TreeSet со всеми различными по координате y точками. 
//
//
//
//Имеется два набора элементов Set. Создать Set, в котором бы находились: все элементы из двух наборов, только общие для двух наборов элементы, только элементы, которые присутствуют в первом наборе и отсутствуют во втором
//
//
//
//На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек: Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.
//
//





