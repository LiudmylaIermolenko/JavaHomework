package org.asd._2025_01_21_Animals._Task_Animals;

public class Cat extends Animals {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat of color " + color + "  meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps at the " + getLocation());
    }
}
