package org.asd._Task_13_03;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TenderTest {

    @Test
    void getSkills() {
        Set<Skill> requiredSkills = Set.of(Skill.CIVIL_ENGINEER, Skill.ARCHITECT, Skill.SURVEYOR);
        Tender tender = new Tender(requiredSkills, "Строительство библиотеки", 10000);

        assertEquals(requiredSkills, tender.getSkills());
    }


    @Test
    void getTenderName() {
        Tender tender = new Tender(Set.of(Skill.CIVIL_ENGINEER), "Строительство библиотеки", 10000);

        assertEquals("Строительство библиотеки", tender.getTenderName());
    }

    @Test
    void getMaxCost() {
        Tender tender = new Tender(Set.of(Skill.CIVIL_ENGINEER), "Строительство библиотеки", 10000);

        assertEquals(10000, tender.getMaxCost());
    }

    @Test
    void findCheapestBrigade() {
        Worker w1 = new Worker("Иван", Skill.CIVIL_ENGINEER);
        Worker w2 = new Worker("Петр", Skill.ARCHITECT);
        Worker w3 = new Worker("Анна", Skill.SURVEYOR);
        Worker w4 = new Worker("Мария", Skill.CARPENTER, Skill.ROOFER);
        Worker w5 = new Worker("Сергей", Skill.ROOFER);
        Worker w6 = new Worker("Алексей", Skill.ECONOMIST);

        Brigade b1 = new Brigade(5000, List.of(w1, w2, w3, w5, w6));
        Brigade b2 = new Brigade(4500, List.of(w1, w2, w3, w4)); // Не подходит
        Brigade b3 = new Brigade(6000, List.of(w1, w2, w3, w5, w6)); // Дороже

        List<Brigade> brigades = List.of(b1, b2, b3);
        Set<Skill> requiredSkills = Set.of(Skill.CIVIL_ENGINEER, Skill.ARCHITECT, Skill.SURVEYOR, Skill.ROOFER, Skill.ECONOMIST);
        Brigade bestBrigade = Tender.findCheapestBrigade(brigades, requiredSkills);

        assertEquals(b1, bestBrigade);

    }

    @Test
    void testToString() {
        Set<Skill> requiredSkills = Set.of(Skill.CIVIL_ENGINEER, Skill.ARCHITECT);
        Tender tender = new Tender(requiredSkills, "Строительство библиотеки", 10000);
        String expected = "Tender{skills=" + requiredSkills + ", tenderName='Строительство библиотеки', cost=10000.0}";

        assertEquals(expected, tender.toString());
    }
}