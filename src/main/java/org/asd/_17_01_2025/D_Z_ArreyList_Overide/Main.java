package org.asd._17_01_2025.D_Z_ArreyList_Overide;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LimitedArrayList<Integer> list = new LimitedArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(150);
        //list.add(30);
        //list.add(30);
        System.out.println(list); // [10, 20, 30]
        list.add(4, 15);// [10, 20, 30, 150, 15]
        System.out.println(list);
//        list.add(6, 25);//Invalid index
//        System.out.println(list);

        list.remove(4);
        System.out.println(list); // [10, 20, 30, 150]
        boolean removedInt =list.remove(Integer.valueOf(10));
        System.out.println(list);

        LimitedArrayList<String> list1 = new LimitedArrayList<>(5);
        list1.add("Hi");
        list1.add("Leute!");
        list1.add("Bye!");
        System.out.println(list1);
        list1.add(1, "You");
        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);
        boolean removedStr =list1.remove("Hi");
        System.out.println(list1);
        //list1.remove(5);
        //System.out.println(list1);

        System.out.println("Contains 15? " + list.contains(15)); // true
        System.out.println("Contains 50? " + list.contains(50)); // false
        System.out.println("Contains Bey!? " + list1.contains("Bye!")); // true

        System.out.println("list1.get(0) = " + list.get(0));
        System.out.println("list1.get(0) = " + list1.get(0));
        //System.out.println("list1.get(5) = " + list.get(5));
        System.out.println("list1.get(list1.size() - 1) = " + list1.get(list1.size() - 1));


        try {
            list.add(40);
            list.add(50);
            list.add(60); // Ошибка!
        } catch(ListFullException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println(list.set(1, 11));
        System.out.println(list);
        System.out.println(list1.set(1, "Hello!"));
        System.out.println(list1);

        System.out.println(list.indexOf(50));
        System.out.println(list.indexOf(20));
        System.out.println(list1.indexOf("Hello!"));

        System.out.println("Вывод элементов через итератор:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Вывод элементов через итератор:");
        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        list.clear();
        System.out.println(list);
        list1.clear();
        System.out.println(list1);
    }
}

