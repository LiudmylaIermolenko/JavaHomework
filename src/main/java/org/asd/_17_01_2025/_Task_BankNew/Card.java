package org.asd._17_01_2025._Task_BankNew;

public class Card {

    private String username;
    private double balance;

    public Card(String name, double balance) {
        this.username = name;
        this.balance = balance;
    }

    public Card(String name) {
        this(name, 0.0);
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
            this.balance += amount;
            System.out.println("Balance of " + getUsername() + " was added in the amount of: " + amount);
            displayBalance();
        } else {
            System.out.println("Error: amount must be > 0.");
        }
    }

    public void getMoney(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                this.balance -= amount;
                System.out.println("Withdrawn amount: " + amount);
                displayBalance();
            } else {
                System.out.println("Error: withdrawal amount must be > balance.");
            }
        } else {
            System.out.println("Error: The withdrawal amount must be > 0");
        }
    }

    public void displayBalance() {
        System.out.println("New balance of username " + getUsername() + " is: " + getBalance() + " $");
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


//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
