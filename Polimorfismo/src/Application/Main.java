package Application;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i);
            System.out.println("Outsourced? (y/n");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hour: ");
            int hours = sc.nextInt();
            System.out.println("Valur per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }

            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments: ");

        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + emp.payment());
        }

        sc.close();
    }
}
