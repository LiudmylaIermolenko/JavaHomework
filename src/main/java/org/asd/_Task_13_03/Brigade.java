package org.asd._Task_13_03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // Проверка, соответствует ли бригада требованиям
    public boolean meetsRequirements(Set<Skill> requiredSkills) {
        Set<Skill> coveredSkills = new HashSet<>();
        Set<Worker> usedWorkers = new HashSet<>();

        for (Skill skill : requiredSkills) {
            boolean found = false;

            for (Worker worker : workers) {
                if (!usedWorkers.contains(worker) && worker.hasSkill(skill)) {
                    usedWorkers.add(worker);
                    coveredSkills.add(skill);
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false; // Не нашли работника с этим навыком
            }
        }
        return true;
    }

    //метод для получения всех уникальных навыков бригады
    public Set<Skill> getAllSkills() {
        Set<Skill> allSkills = new HashSet<>();
        for (Worker worker : workers) {
            allSkills.addAll(worker.getSkills());  // Добавляем навыки каждого работника
        }
        return allSkills;
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


