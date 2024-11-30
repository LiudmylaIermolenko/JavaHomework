package day2;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void jump() {
        if (age < 5) {
            System.out.println(name + " jump");
        } else {
            System.out.println(name + "old");
        }

    }
    public static String meow() {
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat " + name + " age" + age;
    }

}
