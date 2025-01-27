package org.asd._17_01_2025._Task_Bank;


public class MainApp {
    public static void main(String[] args) {
        Card card1 = new Card("Pit", 5000);

        card1.displayBalance();

        card1.deposit(2000);

        card1.getMoney(500);

        card1.displayBalanceInCurrency("Euro", 0.9);
        card1.displayBalanceInCurrency("Pound", 0.7);

        Card card2 = new Card("Anna");

        card2.displayBalance();

    }

}



//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
