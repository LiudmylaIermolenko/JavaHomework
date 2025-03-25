package org.asd._Task_13_03;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TenderTest {

    @Test
    void findCheapestBrigade() {
        Worker w1 = new Worker("Иван", Skill.CIVIL_ENGINEER);
        Worker w2 = new Worker("Петр", Skill.CARPENTER);
        Worker w3 = new Worker("Анна", Skill.ROOFER);
        Worker w4 = new Worker("Мария", Skill.CARPENTER, Skill.ROOFER);
        Worker w5 = new Worker("Сергей", Skill.ROOFER);
        Worker w6 = new Worker("Алексей", Skill.CARPENTER);

        Brigade b1 = new Brigade(5000, List.of(w1, w2, w3, w4, w6));
        Brigade b2 = new Brigade(4500, List.of(w1, w2, w3, w5));
        Brigade b3 = new Brigade(6000, List.of(w1, w2, w3, w5, w6));

        List<Brigade> brigades = List.of(b1, b2, b3);

        Map<Skill, Integer> requiredSkills = new HashMap<>();
        requiredSkills.put(Skill.CIVIL_ENGINEER, 1);
        requiredSkills.put(Skill.CARPENTER, 2);
        requiredSkills.put(Skill.ROOFER, 1);

        Brigade bestBrigade = Tender.findCheapestBrigade(brigades, requiredSkills);

        assertEquals(b1, bestBrigade);
    }

    @Test
    void testFindCheapestBrigade_NoSuitableBrigade() {
        Worker w1 = new Worker("Иван", Skill.CIVIL_ENGINEER);
        Worker w2 = new Worker("Петр", Skill.CARPENTER);
        Worker w3 = new Worker("Анна", Skill.ROOFER);

        Brigade b1 = new Brigade(5000, List.of(w1, w2, w3));

        List<Brigade> brigades = List.of(b1);

        Map<Skill, Integer> requiredSkills = new HashMap<>();
        requiredSkills.put(Skill.ELECTRICIAN, 1);

        assertThrows(RuntimeException.class, () -> {
            Tender.findCheapestBrigade(brigades, requiredSkills);
        });
    }


    @Test
    void testToString() {
        Map<Skill, Integer> requiredSkills = new HashMap<>();
        requiredSkills.put(Skill.CIVIL_ENGINEER, 1);
        requiredSkills.put(Skill.ARCHITECT, 1);

        Tender tender = new Tender(requiredSkills, "Строительство библиотеки");
        String expected = "Tender{requiredSkills=" + requiredSkills + ", tenderName='Строительство библиотеки'}";

        assertEquals(expected, tender.toString());
    }

}