package org.asd.D_Z_Tasks;

import java.util.*;

public class Task_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann"));
        System.out.println(findShortestString(strings));

        List<String> strings1 = new LinkedList<>(List.of("Mary", "Jane", "Tom", "Jane", "Tom", "Tim", "Mark", "Ann"));
        System.out.println(joinStrings(strings1));

        System.out.println(reverseList(strings));
//        List<String> reversedList = reverseList(strings);
//        System.out.println("Список в обратном порядке: " + reversedList);
        List<String> duplicates = findDuplicates(strings1);
        System.out.println("Дубликаты: " + duplicates);


        LinkedList<Integer> list = new LinkedList<>(List.of(1, 4, 3, 2, 3, 2, 2, 0));
        System.out.println("Список: " + list);
        // Метод для поиска первого и последнего вхождения элемента в LinkedList
        int element = 3;
        int[] indices = getFirstAndLastOccurrence(list, element);
        System.out.println("Первое вхождение: " + indices[0]);
        System.out.println("Последнее вхождение: " + indices[1]);
        System.out.println("Occurrences: " + Arrays.toString(indices));

        reverseListInt(list);
        System.out.println("Список после переворота: " + list);


    }

    //9.Перебрать LinkedList и найти самую короткую строку.
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

    //10.Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
//    public static String joinStrings(List<String> list) {
//        return String.join("|", list);
//    }
    public static String joinStrings(List<String> list) {
        if (list.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (String str : list) {
            if (result.length() > 0) {
                result.append("|");
            }
            result.append(str);
        }
        return result.toString();
    }

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
    //С помощью listIterator:
    //c)в котором элементы расположены в обратном порядке.
    public static List<String> reverseList(List<String> list) {
        LinkedList<String> reversed = new LinkedList<>();
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }
        return reversed;
    }

    public static void reverseListInt(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int first = list.get(i);
            int last = list.get(size - 1 - i);
            list.set(i, last);  // Меняем первый элемент с последним
            list.set(size - 1 - i, first);  // Меняем последний элемент с первым
        }
    }

    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> findDuplicates(List<String> list) {
        Set<String> seen = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String str : list) {
            if (!seen.add(str)) { // Если не удалось добавить — дубликат
                duplicates.add(str);
            }
        }
        return duplicates;
    }
}









