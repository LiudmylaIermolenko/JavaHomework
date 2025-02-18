package org.asd.D_Z_Tasks;

import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann"));

        names.add(null);
        names.add("");
        System.out.println(names);
        System.out.println(findMoreThanFour(names));

        System.out.println(names);
        deleteNullAndEmpty(names);
        System.out.println(names);

        System.out.println(reverseList(names));

        removeNamesTFromList(names);
        System.out.println(names);

        replaceStr(names);
        System.out.println(names);


        names.addAll(List.of("Mary", "Mark", "Mark", "Mary", "Tim"));
        System.out.println(names);
        List<String> duplicates = getAllDublicates(names);
        System.out.println("Дубликаты: " + duplicates);
        System.out.println(getAllDublicatesWithIterator(names));


    }

    //8.С помощью итератора:
    //a). Вывести имена, состоящие из 4 букв
    //Метод принимает один параметр – список строк strings (например, имена студентов) и возвращает
    // новый список, содержащий только те строки, у которых длина равна 4 симв
    //Используется метод iterator() для получения объекта итератора,
    // который позволяет пройти по всем элементам входного списка.

    private static List<String> findMoreThanFour(List<String> strings) {
        List<String> result = new ArrayList<>();//будем добавлять имена(длина равна 4)
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s != null && s.length() == 4) {
                result.add(s);
            }
        }
        return result;
    }

    //b). Удалить из списка null и пустые строки.
    public static void deleteNullAndEmpty(List<String> strings) {
        Iterator<String> stringIterator = strings.iterator();//метод iterator()позволяет пройти по всем элементам входного списка.
        while (stringIterator.hasNext()) {
            String s = stringIterator.next();
            if (s == null || s.isEmpty()) {
                stringIterator.remove();
            }

        }
    }

    //С) помощью listIterator: вывести все элементы листа в обратном порядке.
    public static List<String> reverseList(List<String> stringList) {
        //Получение итератора с позиции конца списка:
        //Передавая stringList.size(), мы устанавливаем курсор итератора в конец
        // списка, что позволяет потом двигаться назад (метод hasPrevious() и previous()).
        ListIterator<String> iterator = stringList.listIterator(stringList.size());//Метод listIterator(int index) начинает обход с заданного индекса.
        List<String> result = new ArrayList<>();
        while (iterator.hasPrevious()) {//Обход списка в обратном порядке:
            result.add(iterator.previous());
        }
        return result;
    }

    //d). Удалить из списка все имена, начинающиеся на "T"
    public static void removeNamesTFromList(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().startsWith("T")) {
                listIterator.remove();

                //    while (listIterator.hasPrevious()) {
                //        String str = listIterator.previous();
                //        if (str != null && str.startsWith("T")) {
                //            listIterator.remove();
            }
        }
    }

    //e.Заменить в списке "Ann" на "student Ann"
    private static void replaceStr(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.equals("Ann")) {
                listIterator.set("student Ann");
            }
        }
    }

    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> getAllDublicates(List<String> strings) {
        //создает множество (Set) строк (String), в котором будут храниться найденные дубликаты из списка strings.
        // Хранит найденные дубликаты
        Set<String> stringsDublicates = new HashSet<>();
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    stringsDublicates.add(strings.get(i)); // Добавляем дубликат в Set (автоматически избегая повторений)
                }
            }
        }

        return new ArrayList<>(stringsDublicates);// Преобразуем Set в List и возвращаем
    }

    //Лучше использовать один проход с Set:
    //public static List<String> getAllDublicates(List<String> strings) {
    //Создаем два множества (Set)
    //   Set<String> seen = new HashSet<>();       // Хранит уникальные элементы
    //   Set<String> duplicates = new HashSet<>(); // Хранит найденные дубликаты
    //Мы идем по списку strings и пытаемся добавить каждый элемент в seen.
    //seen.add(str) возвращает false, если str уже был добавлен ранее.
    //Если элемент встречается впервые, он добавляется в seen.
    //Если элемент уже был в seen, значит, он дубликат → добавляем его в duplicates.
    //    for (String str : strings) {
    //        if (!seen.add(str)) { // Если элемент уже есть в "seen", значит, это дубликат
    //            duplicates.add(str);
    //        }
    //    }
    //duplicates — это Set, а метод должен вернуть List<String>.
    //Используем new ArrayList<>(duplicates), чтобы преобразовать Set в List.
    //    return new ArrayList<>(duplicates); // Преобразуем Set в List и возвращаем
    //}
    public static List<String> getAllDublicatesWithIterator(List<String> strings) {
        List<String> copy = new ArrayList<>(strings);
        List<String> stringsDublicates = new ArrayList<>();
        ListIterator<String> stringListIterator = copy.listIterator();
        String str;
        boolean hasDuplicate;
        do {
            str = stringListIterator.next();
            hasDuplicate = false;
            while (stringListIterator.hasNext()) {
                if (stringListIterator.next().equals(str)) {
                    if (!hasDuplicate) {
                        stringsDublicates.add(str);
                        hasDuplicate = true;
                    }
                    stringListIterator.remove();
                }
            }
            while (stringListIterator.hasPrevious()) {
                //System.out.print(stringListIterator.previousIndex());
                if (stringListIterator.previous().equals(str)) {
                    stringListIterator.remove();
                }
            }

        } while (!copy.isEmpty());
        return stringsDublicates;
    }
}


//Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
// * С помощью итератора:
//a). Вывести имена, состоящие из 4 букв
//b). Удалить из списка null и пустые строки.
//С помощью listIterator:
//c). вывести все элементы листа в обратном порядке.
//d). Удалить из списка все имена, начинающиеся на "T"
//e). Заменить в списке "Ann" на "student Ann"
//Найти все дубликаты в List<String> и вернуть их в виде нового списка.
