package org.asd._Task_13_03;

import java.util.*;

public class Brigade {
    private double cost;
    private List<Worker> workers;

    public Brigade(double cost, List<Worker> workers) {
        this.cost = cost;
        this.workers = workers;
    }

    public double getCost() {
        return cost;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
    // Вариант 1: Без дополнительного условия
    public boolean meetsRequirements(Map<Skill, Integer> requiredSkills) {
        Map<Skill, Integer> availableSkills = new HashMap<>();
        for (Worker worker : workers) {
            for (Skill skill : worker.getSkills()) {
                availableSkills.put(skill, availableSkills.getOrDefault(skill, 0) + 1);
            }
        }
        for (Map.Entry<Skill, Integer> entry : requiredSkills.entrySet()) {
            if (availableSkills.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    // Вариант 2: С дополнительным условием (каждый навык — отдельный работник)
    public boolean meetsRequirementsStrict(Map<Skill, Integer> requiredSkills) {
        List<Worker> availableWorkers = new ArrayList<>(workers);
        for (Map.Entry<Skill, Integer> entry : requiredSkills.entrySet()) {
            Skill skill = entry.getKey();
            int requiredCount = entry.getValue();
            int assigned = 0;

            Iterator<Worker> iterator = availableWorkers.iterator();
            while (iterator.hasNext()) {
                Worker worker = iterator.next();
                if (worker.hasSkill(skill)) {
                    iterator.remove();
                    assigned++;
                    if (assigned == requiredCount) break;
                }
            }

            if (assigned < requiredCount) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return "Brigade{cost=" + cost + ", workers=" + workers + "}";
    }
}


