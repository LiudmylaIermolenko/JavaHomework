package org.asd._17_01_2025._Task_Bank_New;

public class DebitCard extends Card {

    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(username + " withdrew " + amount + "$.");
            return true;
        } else {
            System.out.println("Invalid amount.");
            return false;
        }
    }


    //    public static void deposit(Card card, double amount){
//        if (amount > 0){
//          card.setBalance(card.getBalance() + amount);
//            System.out.println("Balance was added in the amount of: " + amount);
//            CreditCard.displayBalance(card);
//        } else {
//            System.out.println("Error: amount must be > 0.");
//        }
//    }
//
//    public static void getMoney(Card card, double amount){
//        if (amount > 0){
//            card.setBalance(card.getBalance() - amount);
//            System.out.println("Withdrawn amount: " + amount);
//            CreditCard.displayBalance(card);
//        } else {
//            System.out.println("Error: The withdrawal amount must be > 0.");
//        }
//    }
}
//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard
// которые реализуют соотв. поведение :
//•    дебетовая карта: не допускает снятие денег (уменьшение баланса)
// если это приводит к отрицательному остатку на карте.
//•    кредитная карта: допускает снятие со счета, даже если баланс не
// положительный. Т.о., у владельца карты накапливается долг.
//Также, реализуйте класс Банкомат (Atm) который, используя переданную
// ему карту, позволяет проводить операции пополнения/снятия/отображения.

