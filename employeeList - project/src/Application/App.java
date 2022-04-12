package Application;

import entities.Employee;

import java.util.*;

public class App {

    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int size = sc.nextInt();

        List<Employee> list = new ArrayList <>();

        for (int i = 0; i < size; i++){
            sc.nextLine();
            System.out.println("Employee: # " + (i+1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println("Enter the employee ID that will hava salary increase: ");
        Integer idSalary = sc.nextInt();

        Integer pos = hasID(list, idSalary);

        if (pos == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter percentage: ");
            Double percent = sc.nextDouble();
            list.get(pos).IncreaseSalary(percent);
        }


        sc.close();
    }

    public static Integer hasID(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
                }
            }
        return -1;
    }
}
