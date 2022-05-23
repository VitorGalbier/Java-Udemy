package com.company;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int numberPayers = sc.nextInt();

        for (int i = 1; i <= numberPayers; i++){
            System.out.println("Tax payer # " + i);
            System.out.println("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual Income: ");
            Double income = sc.nextDouble();

            if (type == 'i'){
                System.out.println("Health expenditures: ");
                Double health = sc.nextDouble();
                list.add(new Individual(name, income, health));
            }
            if (type == 'c'){
                System.out.println("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name, income, numberEmployees));
            }
        }

        System.out.println("TAXES PAID: ");
        Double totalTax = 0.0;

        for(TaxPayer payer : list){
            System.out.println(payer.getName() + ": $ " + payer.tax());
            totalTax += payer.tax();
        }

        System.out.println("Total: " + totalTax);

        sc.close();
    }
}
