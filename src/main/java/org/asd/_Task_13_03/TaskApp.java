package org.asd._Task_13_03;

import java.util.*;


public class TaskApp {
    public static void main(String[] args) {

        Map<Skill, Integer> requiredSkills = new HashMap<>();
        requiredSkills.put(Skill.CIVIL_ENGINEER, 1);
        requiredSkills.put(Skill.CARPENTER, 2);
        requiredSkills.put(Skill.ROOFER, 1);

        Worker w1 = new Worker("Иван", Skill.CIVIL_ENGINEER);
        Worker w2 = new Worker("Петр", Skill.CARPENTER);
        //Worker w2 = new Worker("Петр", Skill.ARCHITECT);
        Worker w3 = new Worker("Анна", Skill.ROOFER);
        Worker w4 = new Worker("Мария", Skill.CARPENTER, Skill.ROOFER);
        Worker w5 = new Worker("Сергей", Skill.ROOFER);
        Worker w6 = new Worker("Алексей", Skill.ELECTRICIAN);

        Brigade b1 = new Brigade(5000, List.of(w1, w2, w3, w4));
        Brigade b2 = new Brigade(4500, List.of(w1, w2, w3, w5));
        Brigade b3 = new Brigade(6000, List.of(w1, w2, w3, w5, w6));

        List<Brigade> brigades = List.of(b1, b2, b3);

        Tender tender = new Tender(requiredSkills, "Строительство библиотеки");


//        try {
//            Brigade cheapestBrigade = Tender.findCheapestBrigade(brigades, requiredSkills);
//            System.out.println("Тендер: " + tender.getTenderName());
//            System.out.println("Требуемые навыки: " + tender.getRequiredSkills());
//            System.out.println("Самая дешевая бригада: " + cheapestBrigade);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            Brigade bestBrigade = Tender.findCheapestBrigade(brigades, tender.getRequiredSkills());
            System.out.println("Подходящая бригада: " + bestBrigade);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Представьте ситуацию: Тендер на строительство ещё одной национальной библиотеки На контракт претендуют несколько бригад строителей. В каждой бригаде есть некоторое количество работников, обладающих набором профессиональных навыков (все навыки ограничены специально созданным вами перечисляемым
// типом enum;  один работник может обладать несколькими навыками), и свое финансовое предложение. Для того чтобы получить контракт, надо соответствовать требованиям (иметь все требуемые навыки). Из подходящих бригад выбрать самую дешевую. Если подходящих не нашлось – закрыть проект строительства☹️ (можно выкинуть исключение)
//
//Использовать коллекции (списки) для представления бригад.
//
//Пример навыков (можете добавлять/изменять/использовать свои): CIVIL_ENGINEER, ARCHITECT, SURVEYOR, ECONOMIST, TECHNOLOGIST, CRANE_OPERATOR, MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS, CARPENTER, ROOFER, CONCRETE_WORKER, PAINTER_PLASTERER
//
//Написать тесты, метод мэйн не обязательно.
//**Дополнительное условие: для каждого требуемого навыка нужен отдельный человек. Прим: если для тендера нужен каменщик и плотник, то только один человек в бригаде может работать каменщиком и другой плотником. Т.е. если в бригаде только 1 человек с навыками каменщик и плотник, и других людей с такими навыками нет, то такая бригада не подойдёт.
