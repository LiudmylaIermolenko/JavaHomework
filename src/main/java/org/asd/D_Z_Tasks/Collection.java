package org.asd.D_Z_Tasks;

import java.util.*;


public class Collection {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>(List.of("AAA", "BBBBB", "CCCCCCC"));
        System.out.println(countChars(strings));
        System.out.println(newListStrMoreThreeElem(strings));

        List<Integer> integers = List.of(32, 1, 0, 2);
        System.out.println(integers);
        System.out.println(getSum(integers));
        System.out.println(findMaxLength(strings));

        System.out.println(findMaxInteger(integers));

        System.out.println(findAllMultiple(integers, 2));
        System.out.println(isSorted(integers));

// Пример для задач со строками:
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("kiwi");
        stringList.add("banana");
        stringList.add("fig");
        // поиск индекса заданной строки
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape"));
        String target = "orange";
//        int index = findStringIndex(list, target);
//        System.out.println("Индекс строки '" + target + "': " + index);
        System.out.println("Индекс строки '" + target + "': " + findStringIndex(list, target));
        target = "pineapple";
//        index = findStringIndex(list, target);
//        System.out.println("Индекс строки '" + target + "': " + index);
        System.out.println("Индекс строки '" + target + "': " + findStringIndex(list, target));

        String prefix = "ap";
        System.out.println("Список содержит строку с префиксом '" + prefix + "': " + containsPrefix(list, prefix));
        prefix = "grг";
        System.out.println("Список содержит строку с префиксом '" + prefix + "': " + containsPrefix(list, prefix));


        // 1. Получение списка длин строк
        List<Integer> lengths = countChars(stringList);
        System.out.println("Длины строк: " + lengths); // Например: [5, 4, 6, 3]
        // 6. Проверка сортировки списка чисел
        List<Integer> sortedNumbers = new ArrayList<>();
        sortedNumbers.add(1);
        sortedNumbers.add(3);
        sortedNumbers.add(5);
        sortedNumbers.add(7);
        System.out.println("Список " + sortedNumbers + " отсортирован? " + isSorted(sortedNumbers)); // true
    }

    //У вас есть список значений String, вы должны вернуть список количества
    // символов этих String
    public static List<Integer> countChars(List<String> strings) {
        List<Integer> countLengths = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            countLengths.add(strings.get(i).length());
            //Этот цикл проходит по всем элементам списка strings.
            //На каждой итерации:Элемент из списка strings присваивается переменной s.
            //Вычисляется длина строки s с помощью s.length().
            //Эта длина добавляется в список lengths.
            //Итог:
            //Список countLengths получает длины строк из списка strings.
            //for (String s : strings) {
            //    countLengths.add(s.length());
            // }
        }
        return countLengths;
    }

    //у вас есть список значений String, вы должны вернуть список со всеми
    // значениями String более трех символов
    public static List<String> newListStrMoreThreeElem(List<String> stringList) {
        List<String> result = new ArrayList<>();
// Проходим по списку и добавляем только те строки, длина которых больше 3
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > 3) {
                result.add(stringList.get(i));
            }
        }
        return result;

    }
    //у вас есть список значений Integer, вы должны вернуть их сумму

    public static int getSum(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);// Складываем все элементы списка
        }
//        for (Integer number : integerList) {
//            sum += number;
//        }
        return sum;
    }

    //у вас есть список String, вы должны вернуть максимальную длину String
    public static int findMaxLength(List<String> strings) {
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    // 4. Дано: список Integer. Нужно вернуть их максимум.
    public static int findMaxInteger(List<Integer> integers) {
        if (integers.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        int max = integers.get(0);
        // Проходим по списку и ищем максимальное значение
        for (Integer number : integers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    //Написать метод, который выдает из исходного списка список всех значений,
    // делящихся на заданное число q.
    public static List<Integer> findAllMultiple(List<Integer> integers, int q) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (Integer num : integers) {
            if (num % q == 0) {
                multiples.add(num);
            }
        }
        return multiples;
    }

    //Написать метод, который проверяет, является ли список Integer отсортированным.
    //чтобы список считался отсортированным по возрастанию, все последовательные пары
    // элементов должны быть расположены в порядке неубывания
    // (то есть каждый следующий элемент должен быть больше или равен предыдущему).
    public static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
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
public static int findStringIndex(List<String> list, String target) {
    return list.indexOf(target);
}

//Проверить, содержит ли List<String> хотя бы одну строку, которая начинается с заданного префикса.
public static boolean containsPrefix(List<String> list, String prefix) {
    for (String str : list) {
        if (str.startsWith(prefix)) {
            return true;
        }
    }
    return false;
}
}

//у вас есть список String, вы должны вернуть максимальную длину String
//Написать метод, который проверяет, является ли список Integer отсортированным.
//Написать метод, который выдает из исходного списка список всех значений, делящихся на заданное число q.
////Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
////

