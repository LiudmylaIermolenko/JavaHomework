package org.asd._2025_01_21_Animals._Task_Animals;

public class Dog extends Animals {
    private String bread;

    public Dog(String food, String location, String bread) {
        super(food, location);
        this.bread = bread;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog of bread " + bread + " barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats food " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in the " + getLocation());
    }
}
