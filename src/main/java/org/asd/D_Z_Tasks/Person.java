package org.asd.D_Z_Tasks;

import java.util.Iterator;
import java.util.LinkedList;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет)";
    }

        public static void main(String[] args) {
            // Создаем LinkedList с объектами Person
            LinkedList<Person> people = new LinkedList<>();
            people.add(new Person("Анна", 25));
            people.add(new Person("Борис", 35));
            people.add(new Person("Виктор", 40));
            people.add(new Person("Дарья", 28));
            people.add(new Person("Егор", 22));

            System.out.println("Исходный список:");
            System.out.println(people);

            Iterator<Person> iterator = people.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().age > 30) {
                    iterator.remove();
                }
            }

            System.out.println("\nСписок после удаления:");
            System.out.println(people);
        }
    }
    //Создать LinkedList с объектами вашего собственного класса и
// удалить все элементы, удовлетворяющие определенному условию.

