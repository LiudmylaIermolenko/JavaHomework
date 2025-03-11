package org.asd.ATM;

public class ATM {

    private int balance = 0;

    public int loadMoney(int emount) {
        balance = balance + emount;
        return balance;
    }

    public int withdrawMoney(int emount) {
        if (emount < 0) {
            throw new IllegalArgumentException();
        }
        if (balance > emount){
            balance = balance - emount;
        } else {
            emount = balance;
            balance = 0;
        }
        return emount;
    }
}
