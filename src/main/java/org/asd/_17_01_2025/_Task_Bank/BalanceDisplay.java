package org.asd._17_01_2025._Task_Bank;

public class BalanceDisplay {

    public static void displayBalance(Card card){
        System.out.println("Balance of username " + card.getUsername() + " is : " + card.getBalance() + " $");
    }
    public static void displayBalanceInCurrency(Card card, String currency, double exchangeRate){
        if (exchangeRate > 0){
            double convertedBalance = card.getBalance()*exchangeRate;
            System.out.printf("User's %s balance in currency %s: %.2f%n", card.getUsername(), currency, convertedBalance);
        } else {
            System.out.println("Error: exchangeRate must be > 0");
        }
    }
}
