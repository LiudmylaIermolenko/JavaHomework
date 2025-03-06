package org.asd.H_Work_04_03;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;
import java.util.regex.*;

public class UserParser {

    public static List<User> parseUsers(String text) {
        List<User> users = new ArrayList<>();
        String[] usersData = text.replaceAll("\\s+\\[User]", "\n").trim().split("\n{2,}");

        for (String userData : usersData) {
            String firstName = extractFirstName(userData);
            String lastName = extractLastName(userData);
            String email = extractEmail(userData);
            String phone = extractPhone(userData);
            int age = extractAge(userData);

            if (firstName != null && lastName != null && email != null && phone != null && age > 0) {
                users.add(new User(firstName, lastName, email, phone, age));
            }
        }
        return users;
    }

    private static String extractFirstName(String userData) {
        Matcher matcher = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+").matcher(userData);
        return matcher.find() ? matcher.group().split(" ")[0] : null;
    }

    private static String extractLastName(String userData) {
        Matcher matcher = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+").matcher(userData);
        return matcher.find() ? matcher.group().split(" ")[1] : null;
    }

    private static String extractEmail(String userData) {
        Matcher matcher = Pattern.compile("\\w+(?:\\.\\w+)*@[\\w.]+\\.(ru|com|net|org|uk)").matcher(userData);
        return matcher.find() ? matcher.group() : null;
    }

    private static String extractPhone(String userData) {
        Matcher matcher = Pattern.compile("\\+[\\d-]{12,}").matcher(userData);
        return matcher.find() ? matcher.group() : null;
    }

    private static int extractAge(String userData) {
        Matcher matcher = Pattern.compile("\\b([1-9][0-9]?)\\b").matcher(userData);
        return matcher.find() ? Integer.parseInt(matcher.group()) : -1;
    }
}




//Реализовать класс User с полями firstName, lastName, email, phone, age.
//
//          Написать класс UserParser, с статическим методом parseUsers который
//        обрабатывает строку следующего формата,
//        и возвращает список юзеров.
