package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){}

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void IncreaseSalary(Double percentage){
            salary += (salary * (percentage / 100));
    }

    //usar toString
}
