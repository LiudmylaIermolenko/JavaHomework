package org.asd._2025_01_21_Animals._Task_Animals;

public class Horse extends Animals {
    private String name;
    private int speed;

    public Horse(String food, String location, String name, int speed) {
        super(food, location);
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse neighs "  + "and has speed " + speed + " km/hour");
    }

    @Override
    public void eat() {
        System.out.println("Horse " + name + "eats " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps in the " + getLocation());
    }
}
