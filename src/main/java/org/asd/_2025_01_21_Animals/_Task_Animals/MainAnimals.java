package org.asd._2025_01_21_Animals._Task_Animals;

public class MainAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Pady", "Street", "Spaniel");
        Cat cat = new Cat("Wiskas", "Flat", "Black");
        Horse horse = new Horse("Grass", "Hof", "Charli", 60);

        Animals[] animals = {dog, cat, horse};

//        animals[0].makeNoise();
//        animals[1].makeNoise();
//        animals[2].makeNoise();
//        System.out.println();
        System.out.println("Animals says:");
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
        }
        System.out.println();

//        animals[0].eat();
//        animals[1].eat();
//        animals[2].eat();
//        System.out.println();
        System.out.println("Animals eats:");
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
        System.out.println();

        System.out.println("Vet rekomends:");

        animals[0].setFood("to Dog: Pady2x");
        animals[1].setFood("to Cat: Wiskas2x");
        animals[2].setFood("to Horse: Grass2x");

        animals[0].setLocation("Street,cute");
        animals[1].setLocation("Flat,cute");
        animals[2].setLocation("Hof,cute");


        Vet vet = new Vet();

        for (int i = 0; i < animals.length; i++) {
           vet.treatAnimal(animals[i]);
            System.out.println();
        }
        //for (Animal animal : animals) {
        //            vet.treatAnimal(animal);
        //            System.out.println();
        //        }
    }
}
