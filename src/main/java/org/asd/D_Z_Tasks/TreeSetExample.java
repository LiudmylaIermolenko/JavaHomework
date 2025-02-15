package org.asd.D_Z_Tasks;

import java.util.NavigableSet;
import java.util.TreeSet;

//    Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое
//    Вывести все четные числа Получить список всех чисел в обратном порядке Получить
//    список всех чисел меньше 7
//TreeSet хранит элементы в отсортированном порядке по умолчанию (по возрастанию)
//TreeSet удобно использовать, когда нужна уникальная коллекция + автоматическая сортировка
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);

        boolean contains10 = numbers.contains(10);
        System.out.println("Число 10 есть в наборе: " + contains10);

        int min = numbers.first();
        int max = numbers.last();
        System.out.println("Самое маленькое число: " + min);
        System.out.println("Самое большое число: " + max);

        System.out.print("Четные числа: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Получить список всех чисел в обратном порядке
        NavigableSet<Integer> reversed = numbers.descendingSet();
        System.out.println("Числа в обратном порядке: " + reversed);

        // Получить список всех чисел меньше 7
        //меньшие (headSet()) или большие (tailSet()) значения от заданного числа.
        //Метод берет все элементы, которые идут перед числом 7 в отсортированном порядке.
        //Число 7 в результат не включается
        TreeSet<Integer> lessThanSeven = new TreeSet<>(numbers.headSet(7));
        System.out.println("Числа меньше 7: " + lessThanSeven);
    }

//    Создать класс Point для хранения координат (x, y) точки на плоскости. Создать список точек, отсортировать по координате y. Создать TreeSet со всеми уникальными точками. Создать
//    TreeSet со всеми различными по координате y точками.


}
