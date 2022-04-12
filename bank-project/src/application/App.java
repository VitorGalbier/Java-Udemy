package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        int AccNumber;
        String AccName;
        double InitialValue;

        System.out.println("Enter Account Number: ");
        AccNumber = sc.nextInt();

        System.out.println("Enter Account Name: ");
        sc.nextLine();
        AccName = sc.nextLine();

        System.out.println("Is there an Initial deposit? y/n ");
        char Answer = sc.next().charAt(0);

        if(Answer == 'y'){
            System.out.println("Enter initial value: ");
            InitialValue = sc.nextDouble();
            account = new Account(AccNumber, AccName, InitialValue);
        }else{
            System.out.println("Account Created!");
            account = new Account(AccNumber, AccName);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.addValue(depositValue);
        System.out.println("Update account data!");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.remValue(withdrawValue);
        System.out.println("Update account data!");
        System.out.println(account);

        sc.close();
    }
}
