package com.company;

import Model.Entities.Account;
import Model.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
