package day2;

public class Main {
    public static void main(String[] args) {


        Cat ryzh = new Cat("Ryzh");
        Cat nameObject2 = new Cat("barsik",10);
        Cat bars = new Cat("barsik2", 15);
        Cat mur = new Cat("murz", 3);
        Cat nameObject3 = new Cat();
        System.out.println();
        nameObject2.setAge(13);
        nameObject3.setName("Мурка");
        System.out.println("name" + nameObject3);
        ryzh.jump();
        System.out.println(Cat.meow());
    }
}

