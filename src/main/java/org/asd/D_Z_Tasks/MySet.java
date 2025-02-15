package org.asd.D_Z_Tasks;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> integerSet = Set.of(8, 6, 3, 2, 1, 4, 0);
        Set<java.lang.String> stringsSet = Set.of("AA", "BBB");
        java.lang.String str = "cggbnm JJHG";

        System.out.println(getSum(integerSet));
        System.out.println(getCombination(stringsSet, integerSet));

        getUnique(str);
        System.out.println("Hello".hashCode());
        System.out.println("H".hashCode());
        System.out.println(Integer.valueOf(10).hashCode());
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(10);
        integerSet1.add(5);
        System.out.println(integerSet1);

        boolean contains = integerSet1.contains(10);

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(4, 5, 6, 7, 8));
        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Объединение: " + union(set1, set2));
        System.out.println("Пересечение: " + intersection(set1, set2));
        System.out.println("Разность (set1 - set2): " + difference(set1, set2));
    }

    //Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
    public static int getSum(Set<Integer> integerSet) {
        int sum = 0;
        for (Integer anInt : integerSet) {
            if (anInt % 2 == 0) {
                sum += anInt;
            }
        }
        return sum;
    }

    //Получить все возможные комбинации из Set<String> и Set<Integer>,
    // где каждая комбинация представляет собой строку и число, объединенные вместе.
    public static Set<java.lang.String> getCombination(Set<java.lang.String> strings, Set<Integer> integers) {
        Set<java.lang.String> result = new HashSet<>();
        for (Integer anInt : integers) {
            for (java.lang.String str : strings) {
                java.lang.String combination = str + anInt;
                result.add(combination);
            }

        }
        return result;
    }

    public static void getUnique(java.lang.String string) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.charAt(i));
        }
        System.out.println(result + " count " + result.size());
    }

    //Имеется два набора элементов Set. Создать Set, в котором бы находились:
    //    // все элементы из двух наборов, только общие для двух наборов элементы,
    //    // только элементы, которые присутствуют в первом наборе и отсутствуют во втором
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Метод пересечения множеств
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    // Метод разности (set1 - set2)
    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}









