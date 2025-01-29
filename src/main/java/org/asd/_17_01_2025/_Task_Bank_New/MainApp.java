package org.asd._17_01_2025._Task_Bank_New;


public class MainApp {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("Anna", 500);
        CreditCard creditCard = new CreditCard("Anna", 200);

        DebitCard debitCard1 = new DebitCard("Pit", 1500);
        CreditCard creditCard1 = new CreditCard("Pit", 200);
        Atm atm = new Atm();

        atm.insertCard(debitCard);
        atm.checkBalance();
        atm.deposit(200);
        atm.withdraw(100);
        atm.checkBalance();
        atm.ejectCard();

        atm.insertCard(creditCard);
        atm.checkBalance();
        atm.withdraw(300);
        atm.checkBalance();
        atm.ejectCard();

        atm.insertCard(debitCard1);
        atm.deposit(200);
        atm.withdraw(1500);
        atm.checkBalance();
        atm.ejectCard();

        atm.insertCard(creditCard1);
        atm.withdraw(3000);
        atm.checkBalance();
        atm.ejectCard();
    }
}



//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//-создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса
// в различных валютах, передавая курс валюты
