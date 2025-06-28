package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testInitialBalance() {
        BankAccount account = new BankAccount(1000);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(800);
        account.withdraw(300);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawTooMuch() {
        BankAccount account = new BankAccount(400);
        account.withdraw(500); // should throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount(400);
        account.deposit(-100); // should throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInitialBalance() {
        new BankAccount(-50); // should throw
    }
}
