package org.asd;
public class Cat {

    int age;

    String name;

    Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
    Cat(String name) {
        this.name = name;
    }
    Cat() {

    }

    @Override
    public String toString() {
        return "Kitty{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
//public String name;
//public  Integer age;
//public static int counter;
//
//    public Cat(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//

//
//    public void meow() {
//        System.out.println("meow" + name);
//}



