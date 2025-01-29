package org.asd._17_01_2025._Task_Bank_New;

public class CreditCard extends Card{

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println(username + " withdrew " + amount + "$ (credit money). ");
            return true;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
}
