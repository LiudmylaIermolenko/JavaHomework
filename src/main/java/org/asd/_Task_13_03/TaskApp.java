package org.asd._Task_13_03;

import java.util.*;


public class TaskApp {
    public static void main(String[] args) {
// 1. Требования для обычной проверки
        Map<Skill, Integer> requiredSkillsGeneral = new HashMap<>();
        requiredSkillsGeneral.put(Skill.CIVIL_ENGINEER, 1);
        requiredSkillsGeneral.put(Skill.CARPENTER, 1);
        requiredSkillsGeneral.put(Skill.PAINTER_PLASTERER, 1);

        // 2. Требования для строгой проверки (разные люди для каждого навыка)
        Map<Skill, Integer> requiredSkillsStrict = new HashMap<>();
        requiredSkillsStrict.put(Skill.CARPENTER, 1);
        requiredSkillsStrict.put(Skill.PAINTER_PLASTERER, 1);
        requiredSkillsStrict.put(Skill.ELECTRICIAN, 1);

//        // Создание рабочих
//        Worker w1 = new Worker("Рабочий 1", Skill.CIVIL_ENGINEER);
//        Worker w2 = new Worker("Рабочий 2", Skill.CARPENTER);
//        Worker w3 = new Worker("Рабочий 3", Skill.PAINTER_PLASTERER);
        Worker w1 = new Worker("Рабочий 1", Skill.CIVIL_ENGINEER, Skill.CARPENTER, Skill.PAINTER_PLASTERER);
        Worker w2 = new Worker("Рабочий 2", Skill.PAINTER_PLASTERER);
        Worker w3 = new Worker("Рабочий 3", Skill.CRANE_OPERATOR);

//        Worker w4 = new Worker("Рабочий 4", Skill.CARPENTER);
//        Worker w5 = new Worker("Рабочий 5", Skill.PAINTER_PLASTERER);
//        Worker w6 = new Worker("Рабочий 6", Skill.ELECTRICIAN);
        Worker w4 = new Worker("Рабочий 4", Skill.CARPENTER, Skill.PAINTER_PLASTERER);
        Worker w5 = new Worker("Рабочий 5", Skill.CARPENTER, Skill.PAINTER_PLASTERER);
        Worker w6 = new Worker("Рабочий 6", Skill.CARPENTER, Skill.PAINTER_PLASTERER, Skill.ELECTRICIAN);

        // Создание бригад
        Brigade b1 = new Brigade(5000, List.of(w1, w2, w3));
        Brigade b2 = new Brigade(5500, List.of(w4, w5, w6));

        List<Brigade> brigades = List.of(b1, b2);

        // Создаем тендер
        Tender tender = new Tender(requiredSkillsGeneral, "Строительство библиотеки");

        try {
            Brigade bestBrigade = Tender.findCheapestBrigade(brigades, tender.getRequiredSkills());
            System.out.println("Лучшая бригада по стоимости: " + bestBrigade);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n=== Поиск с ограничением (разные люди для каждого навыка) ===");
            Brigade cheapestBrigadeStrict = Tender.findCheapestBrigadeStrict(brigades, requiredSkillsStrict);
            System.out.println("Самая дешевая бригада (строгие требования): " + cheapestBrigadeStrict);
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
