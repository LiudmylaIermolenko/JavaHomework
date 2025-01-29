package org.asd._17_01_2025._Task_Bank_New;

public abstract class Card {

        protected String username;
        protected double balance;

        public Card(String name, double balance) {
            this.username = name;
            this.balance = balance;
        }

        public String getUsername() {
            return username;
        }

        public double getBalance() {
            return balance;
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

    public abstract boolean withdraw(double amount);

    }


    //на базе прошлой домашней работы
//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard
// которые реализуют соотв. поведение :
//•    дебетовая карта: не допускает снятие денег (уменьшение баланса)
// если это приводит к отрицательному остатку на карте.
//•    кредитная карта: допускает снятие со счета, даже если баланс не
// положительный. Т.о., у владельца карты накапливается долг.
//Также, реализуйте класс Банкомат (Atm) который, используя переданную
// ему карту, позволяет проводить операции пополнения/снятия/отображения.

//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
