package org.asd.ATM;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ATMTest {

    private ATM  atm;

    @BeforeEach
    void setUp() {
        atm = new ATM(); // Новый банкомат перед каждым тестом
        atm.loadMoney(100); // Загружаем 100 перед каждым тестом
    }

    @Test
    void putMoneyToATM() {
        //ATM atm = new ATM();
        int sum = atm.loadMoney(100);
        Assertions.assertEquals(200, sum);
    }

    @Test
    void withdrawMoney() {
        //ATM atm = new ATM();
        int sum = atm.withdrawMoney(40);
        Assertions.assertEquals(40, sum);
    }

    @Test
    void withdrawMoneyWhenMoreThenBalance() {
        //ATM atm = new ATM();//100 na balance
        int sum = atm.withdrawMoney(140);//sniali 100
        Assertions.assertEquals(100, sum);//0 na balanse

        sum = atm.withdrawMoney(140);
        Assertions.assertEquals(0, sum);//0
    }

    @Test
    void withdrawMoneyWhenNegative() {
        //ATM atm = new ATM();//100 na balanse
        Assertions.assertThrows(IllegalArgumentException.class, () -> atm.withdrawMoney(-140));

    }
}