package Entities;

public class Company extends TaxPayer {
    private int numberEmployees;

    public Company(String name, Double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double tax(){
        double taxPaid = 0.0;
        if(getNumberEmployees() > 10){
            taxPaid = getAnualIncome() * 0.14;
            return taxPaid;
        }
        else {
            taxPaid = getAnualIncome() * 0.16;
            return taxPaid;
        }
    }
}
