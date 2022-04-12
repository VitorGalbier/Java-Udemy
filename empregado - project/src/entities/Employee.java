package entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        double salary =  GrossSalary - Tax;
        return salary;
    }

    public void IncreaseSalary (double percentage){
        double newSalary = NetSalary() * (percentage/100);
    }
}
