package org.asd._17_01_2025._Task_Bank;


public class MainApp {
    public static void main(String[] args) {
        Card card1 = new Card("Pit", 5000);

        BalanceDisplay.displayBalance(card1);

        PowerCard.deposit(card1, 2000);

        PowerCard.getMoney(card1, 500);

        BalanceDisplay.displayBalanceInCurrency(card1, "Euro", 0.9);
        BalanceDisplay.displayBalanceInCurrency(card1, "Pound", 0.7);

        Card card2 = new Card("Anna");

        BalanceDisplay.displayBalance(card2);

    }
}



//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
