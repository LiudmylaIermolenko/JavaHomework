package org.asd._17_01_2025._Task_Bank;

public class PowerCard {

    public static void deposit(Card card,double amount){
        if (amount > 0){
          card.setBalance(card.getBalance() + amount);
            System.out.println("Balance was added in the amount of: " + amount);
            BalanceDisplay.displayBalance(card);
        } else {
            System.out.println("Error: amount must be > 0.");
        }
    }

    public static void getMoney(Card card, double amount){
        if (amount > 0){
            card.setBalance(card.getBalance() - amount);
            System.out.println("Withdrawn amount: " + amount);
            BalanceDisplay.displayBalance(card);
        } else {
            System.out.println("Error: The withdrawal amount must be > 0.");
        }
    }
}
