package org.asd._2025_01_21;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(LocalDate.of(1990,1,1));
        Person person2 = new Person(LocalDate.of(1990,1,1));

        System.out.println(person1.equals(person2));
    }

    public static void print(Person person){
        System.out.println(person);
    }
}
