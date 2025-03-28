/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingsystem;

/**
 *
 * @author arooj fatima
 */
public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Savings Account:");
        SavingAccount savings = new SavingAccount("SA123", 1000.0, 5);
        savings.displayDetails();
        savings.addInterest();

        System.out.println("\nCurrent Account:");
        CurrentAccount current = new CurrentAccount("CA456", 500.0, 1000.0);
        current.displayDetails();

        System.out.println("\nFixed Deposit Account:");
        FixedDepositAccount fixed = new FixedDepositAccount("FD789", 2000.0, 3);
        fixed.displayDetails();
        fixed.displayMaturityPeriod();
    }
}
