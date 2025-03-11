package org.asd._17_01_2025._Task_Bank;

public class Card {

    private String username;
    private double balance;

    public Card(String name, double balance) {
        this.username = name;
        this.balance = balance;
    }

    public Card(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(username + " deposited " + amount + "$.");
            displayBalance();
        } else {
            System.out.println("Error: amount must be > 0.");
        }
    }

    public void displayBalance() {
        System.out.println(username + "'s balance: " + balance + "$.");
    }


    public void getMoney(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn amount: " + amount);
                displayBalance();
            } else {
                System.out.println("Error: withdrawal amount must be > balance.");
            }
        } else {
            System.out.println("Error: The withdrawal amount must be > 0");
        }
    }


    // Метод для отображения баланса в другой валюте
    public void displayBalanceInCurrency(String currency, double exchangeRate) {
        if (exchangeRate > 0) {
            double convertedBalance = balance * exchangeRate;
            System.out.printf("User's %s balance in currency %s: %.2f%n", username, currency, convertedBalance);
        } else {
            System.out.println("Error: exchangeRate must be > 0");
        }
    }
}
//Домашнее, на базе прошлой домашней работы
//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard
// которые реализуют соотв. поведение :
//•    дебетовая карта: не допускает снятие денег (уменьшение баланса)
// если это приводит к отрицательному остатку на карте.
//•    кредитная карта: допускает снятие со счета, даже если баланс не
// положительный. Т.о., у владельца карты накапливается долг.
//Также, реализуйте класс Банкомат (Atm) который, используя переданную
// ему карту, позволяет проводить операции пополнения/снятия/отображения.
//
//
//** Дополнительное условие, по желанию: Реализовать работу с пинкодом
// Карты (не допускать любые операции, если введён не верный пинкод)

//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
