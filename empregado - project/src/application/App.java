package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.printf("Employee: %s, %.2f%n", employee.name, employee.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated Data: %s, %.2f%n", employee.name, employee.NetSalary());

        sc.close();
    }
}
