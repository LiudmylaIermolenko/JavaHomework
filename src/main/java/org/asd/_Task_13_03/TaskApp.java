package org.asd._Task_13_03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
public class TaskApp {
    public static void main(String[] args) {
//
//        Worker worker1 = new Worker("John", Skill.CIVIL_ENGINEER);
//        Worker worker2 = new Worker("Jane", Skill.ARCHITECT);
//
//        List<Worker> workers1 = Arrays.asList(worker1, worker2);
//        Brigade brigade1 = new Brigade(5000, workers1);
//
//        Worker worker3 = new Worker("Bob", Skill.CARPENTER);
//        Worker worker4 = new Worker("Alice", Skill.PAINTER_PLASTERER);
//
//        List<Worker> workers2 = Arrays.asList(worker3, worker4);
//        Brigade brigade2 = new Brigade(6000, workers2);
//
//        //List<Brigade> brigades = Arrays.asList(brigade1, brigade2);
//
//        Worker worker5 = new Worker("Dave", Skill.ROOFER);
//        List<Worker> workers3 = Arrays.asList(worker1, worker2, worker5);
//        Brigade brigade3 = new Brigade(4500, workers3);
//
//        List<Brigade> brigades = Arrays.asList(brigade1, brigade2, brigade3);
//
//        Set<Skill> requiredSkills = new HashSet<>(Arrays.asList(
//                Skill.CIVIL_ENGINEER, Skill.ARCHITECT, Skill.ROOFER));
//
//        try {
//            Brigade bestBrigade = Tender.findCheapestBrigade(brigades, requiredSkills);
//            System.out.println("Выбрана бригада: " + bestBrigade);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    }

        Set<Skill> requiredSkills = new HashSet<>();
        requiredSkills.add(Skill.CIVIL_ENGINEER);
        requiredSkills.add(Skill.CARPENTER);
        requiredSkills.add(Skill.ROOFER);

        Worker worker1 = new Worker("Иван", Skill.CIVIL_ENGINEER);
        Worker worker2 = new Worker("Пётр", Skill.CARPENTER);
        Worker worker3 = new Worker("Сергей", Skill.ROOFER);
        Worker worker4 = new Worker("Антон", Skill.CIVIL_ENGINEER, Skill.PAINTER_PLASTERER);

        Brigade brigade1 = new Brigade(5000, Arrays.asList(worker1, worker2, worker3)); // Подходит
        Brigade brigade2 = new Brigade(4500, Arrays.asList(worker1, worker4)); // Не хватает плотника
        Brigade brigade3 = new Brigade(6000, Arrays.asList(worker2, worker3, worker4)); // Подходит, но дороже

        List<Brigade> brigades = Arrays.asList(brigade1, brigade2, brigade3);

        Tender tender = new Tender(requiredSkills, "Строительство библиотеки", 6000);


        try {
            Brigade cheapestBrigade = Tender.findCheapestBrigade(brigades, requiredSkills);

            System.out.println("Тендер: " + tender.getTenderName());
            System.out.println("Требуемые навыки: " + tender.getSkills());
            System.out.println("Самая дешевая бригада: " + cheapestBrigade);
            System.out.println("Навыки самой дешевой бригады: " + cheapestBrigade.getAllSkills());
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
