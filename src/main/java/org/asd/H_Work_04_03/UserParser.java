package org.asd.H_Work_04_03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {
    public static List<User> parseUsers(String text) {
        List<User> users = new ArrayList<>();
        String[] usersData = text.replaceAll("\\s+\\[User]", "\n").trim().split("\n{2,}");

        Pattern namePattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
        Pattern emailPattern = Pattern.compile("[\\w.]+@[\\w.]+\\.(ru|com|net|org|uk)");
        Pattern phonePattern = Pattern.compile("\\+[\\d-]{12,}");
        Pattern agePattern = Pattern.compile("\\b([1-9][0-9]?)\\b");

        for (String userData : usersData) {
            String firstName = null;
            String lastName = null;
            String email = null;
            String phone = null;
            int age = -1;

            //.group() возвращает найденное совпадение ("John Smith"),.split(" ") разбивает строку по пробелу, создавая массив:
            //nameParts = ["John", "Smith"];
            Matcher nameMatcher = namePattern.matcher(userData);
            if (nameMatcher.find()) {
                String[] nameParts = nameMatcher.group().split(" ");
                firstName = nameParts[0];
                lastName = nameParts[1];
            }
                Matcher emailMatcher = emailPattern.matcher(userData);
                if (emailMatcher.find()) {
                    email = emailMatcher.group();
                }

                Matcher phoneMatcher = phonePattern.matcher(userData);
                if (phoneMatcher.find()) {
                    phone = phoneMatcher.group();
                }

                Matcher ageMatcher = agePattern.matcher(userData);
                if (ageMatcher.find()) {
                    age = Integer.parseInt(ageMatcher.group());
                }

                if (firstName != null && lastName != null && email != null && phone != null && age > 0) {
                    users.add(new User(firstName, lastName, email, phone, age));
                }
            }
        return users;
        }


    }




//Реализовать класс User с полями firstName, lastName, email, phone, age.
//
//          Написать класс UserParser, с статическим методом parseUsers который
//        обрабатывает строку следующего формата,
//        и возвращает список юзеров.
//
//
//В случае не корректных данных (Прим: Mike_007), этот юзер в список попадать не должен.
//