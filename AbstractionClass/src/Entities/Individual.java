package Entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        double taxPaid = 0.0;
        double discount = 0.0;
        if (getAnualIncome() < 20000.00){
            taxPaid = getAnualIncome() * 0.15;
            if (getHealthExpenditures() > 0){
                discount = getHealthExpenditures() / 2;
            }
            return taxPaid - discount;
        }
        else{
            taxPaid = getAnualIncome() * 0.25;
            if (getHealthExpenditures() > 0){
                discount = getHealthExpenditures() / 2;
            }
            return taxPaid - discount;
        }
    }
}
