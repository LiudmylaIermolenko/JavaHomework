package org.asd._17_01_2025._Task_Bank_New;

public class Atm {
    private Card insertedCard;

    public void insertCard(Card card) {
        this.insertedCard = card;
        System.out.println(card.getUsername() + " inserted the card.");
    }

    public void ejectCard() {
        if (insertedCard != null) {
            System.out.println(insertedCard.getUsername() + "'s card ejected.");
            insertedCard = null;
            System.out.println();
        } else {
            System.out.println("No card inserted.");
        }
    }

    public void deposit(double amount) {
        if (insertedCard != null) {
            insertedCard.deposit(amount);
        } else {
            System.out.println("No card inserted.");
        }
    }

    public void withdraw(double amount) {
        if (insertedCard != null) {
            insertedCard.withdraw(amount);
        } else {
            System.out.println("No card inserted.");
        }
    }

    public void checkBalance() {
        if (insertedCard != null) {
            insertedCard.displayBalance();
        } else {
            System.out.println("No card inserted.");
        }
    }
}
