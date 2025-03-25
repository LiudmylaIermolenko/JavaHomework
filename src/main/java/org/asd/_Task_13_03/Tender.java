package org.asd._Task_13_03;

import java.util.List;
import java.util.Map;

public class Tender {

    private Map<Skill, Integer> requiredSkills;

    private String tenderName;

    public Tender(Map<Skill, Integer> requiredSkills, String tenderName) {
        this.requiredSkills = requiredSkills;
        this.tenderName = tenderName;
    }

    public Map<Skill, Integer> getRequiredSkills() {
        return requiredSkills;
    }

    public String getTenderName() {
        return tenderName;
    }

    public static Brigade findCheapestBrigade(List<Brigade> brigades, Map<Skill, Integer> requiredSkills) {
        Brigade cheapestBrigade = null;
        double minCost = Double.MAX_VALUE;

        for (Brigade brigade : brigades) {
            if (brigade.meetsRequirements(requiredSkills)) {
                if (brigade.getCost() < minCost) {
                    cheapestBrigade = brigade;
                    minCost = brigade.getCost();
                }
            }
        }

        if (cheapestBrigade == null) {
            throw new RuntimeException("Нет подходящих бригад, проект закрыт");
        }
        return cheapestBrigade;
    }


    public static Brigade findCheapestBrigadeStrict(List<Brigade> brigades, Map<Skill, Integer> requiredSkills) {
        Brigade cheapestBrigade = null;
        double minCost = Double.MAX_VALUE;

        for (Brigade brigade : brigades) {
            if (brigade.meetsRequirementsStrict(requiredSkills)) {  // Вариант 2
                if (brigade.getCost() < minCost) {
                    cheapestBrigade = brigade;
                    minCost = brigade.getCost();
                }
            }
        }

        if (cheapestBrigade == null) {
            throw new RuntimeException("Нет подходящих бригад, проект закрыт");
        }
        return cheapestBrigade;
    }



    @Override
    public String toString() {
        return "Tender{requiredSkills=" + requiredSkills + ", tenderName='" + tenderName + "'}";
    }
}
