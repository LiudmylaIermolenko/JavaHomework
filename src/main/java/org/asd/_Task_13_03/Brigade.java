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

    public boolean meetsRequirements(Map<Skill, Integer> requiredSkills) {
        Map<Skill, Integer> availableSkills = new HashMap<>();
        Set<Worker> usedWorkers = new HashSet<>();

        for (Worker worker : workers) {
            for (Skill skill : worker.getSkills()) {
                availableSkills.put(skill, availableSkills.getOrDefault(skill, 0) + 1);
            }
        }
        //проверяем бригады на соответствие требованиям:
//        System.out.println("Проверяем бригаду: " + this);
//        System.out.println("Доступные навыки: " + availableSkills);
//        System.out.println("Требуемые навыки: " + requiredSkills);

        for (Map.Entry<Skill, Integer> entry : requiredSkills.entrySet()) {
            Skill skill = entry.getKey();
            int requiredCount = entry.getValue();
            int assigned = 0;

            for (Worker worker : workers) {
                if (!usedWorkers.contains(worker) && worker.hasSkill(skill)) {
                    usedWorkers.add(worker);
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


//public class Team {
//    private List<Worker> workerList = new ArrayList<>();
//
//    private double price;// Цена контракта
//
//    public List<Worker> getWorkerList() {
//        return workerList;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void addWorker(Worker ... workers){
//        for (Worker worker : workers){
//            workerList.add(worker);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Team{" +
//                "workerList=" + workerList +
//                ", cost=" + price +
//                '}';
//    }


