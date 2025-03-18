package org.asd._Task_13_03;

import java.util.List;
import java.util.Set;

public class Tender {

     private Set<Skill> requiredSkills;

    private String tenderName;

    private double maxCost;

    public Tender(Set<Skill> requiredSkills, String tenderName, double cost) {
        this.requiredSkills = requiredSkills;
        this.tenderName = tenderName;
        this.maxCost = cost;
    }

    public Set<Skill> getSkills() {
        return requiredSkills;
    }

    public String getTenderName() {
        return tenderName;
    }

    public double getMaxCost() {
        return maxCost;
    }

    public static Brigade findCheapestBrigade(List<Brigade> brigades, Set<Skill> requiredSkills) {
        Brigade cheapestBrigade = null;
        double minCost = Double.MAX_VALUE;

        for (Brigade brigade : brigades) {
            if (brigade.meetsRequirements(requiredSkills) && brigade.getCost() < minCost) {
                cheapestBrigade = brigade;
                minCost = brigade.getCost();
            }
        }

        if (cheapestBrigade == null) {
            throw new RuntimeException("Нет подходящих бригад, проект закрыт");
        }
        return cheapestBrigade;
    }



    @Override
    public String toString() {
        return "Tender{" +
                "skills=" + requiredSkills +
                ", tenderName='" + tenderName + '\'' +
                ", cost=" + maxCost +
                '}';
    }
}
