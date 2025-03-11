package org.asd._2025_01_21;

import java.time.LocalDate;


public class Person {

    private LocalDate dateBirth;

    public Person(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
        return false;
    }
    Person p = (Person) obj;
    return this.dateBirth.equals(p.dateBirth);
    }
}
