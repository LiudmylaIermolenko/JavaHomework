package org.asd._Task_13_03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Worker {

    private String name;

    private Set<Skill> skills = new HashSet<>();

    public Worker(String name, Skill... skills) {
        this.name = name;
        for (Skill skill : skills) {
            this.skills.add(skill);
        }
    }

public boolean hasSkill(Skill skill) {
    return skills.contains(skill);
}

public Set<Skill> getSkills() {
    return skills;
}
//    public Worker(String name) {
//        this.name = name;
//    }
//
//    public void addSkill(Skill... skillList) {
//        for (Skill skill : skillList) {
//            skills.add(skill);
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && Objects.equals(skills, worker.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, skills);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
