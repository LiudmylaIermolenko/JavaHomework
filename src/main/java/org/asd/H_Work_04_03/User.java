package org.asd.H_Work_04_03;

public class User {

       private String firstName;
       private String lastName;
       private String email;
       private String phone;
       private int age;

    public User(String firstName, String lastname, String email, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + email + "; " + phone + "; " + " age: " + age;
    }
}








//Реализовать класс User с полями firstName, lastName, email, phone, age.
//
//          Написать класс UserParser, с статическим методом parseUsers который обрабатывает строку следующего формата,
//        и возвращает список юзеров.
//
//
//В случае не корректных данных (Прим: Mike_007), этот юзер в список попадать не должен.
//
//
//String document = “””
//        [User]
//
//Name: John Smith
//
//Email: john.smith@example.com
//
//Phone: +44-7911-123456
//
//Age: 28
//
//
//
//        [User]
//
//Name: Emily Johnson
//
//Email: emily.j@example.co.uk
//
//Phone: +49-1521-9876543
//
//Age: 35
//
//
//
//        [User]
//
//Name: William Brown
//
//Email: william.brown@mail.net
//
//Phone: +33-6-12-34-56-78
//
//Age: 42
//
//
//
//        [User]
//
//Name: Mike_007
//
//Email: mike007@website
//
//Phone: +34-654-321
//
//Age: 16
//
//
//
//        [User]
//
//Name: Jessica Davis
//
//Email: jessica.davis@example.org
//
//Phone: +31-612345678
//
//Age: 24
//
//
//
//        [User]
//
//Name: Thomas Anderson
//
//Email: thomas@matrix.com
//
//Phone: +41-78-987-65-43
//
//Age: 35
//        “””;