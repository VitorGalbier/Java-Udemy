package entities;

public class Account {

    private int numberAccount;
    private String name;
    private double value;

    public Account(int numberAccount, String name, double initialValue) {
        this.numberAccount = numberAccount;
        this.name = name;
        addValue(initialValue);
    }

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String toString(){
        return "Account "
                + numberAccount
                + ", Holder: "
                + name
                + ", Balance: "
                + String.format("%.2f", value);
    }

    public void addValue(double ValueAdded){
        this.value += ValueAdded;
        System.out.println("New value: " + this.value);
    }

    public void remValue(double ValueRemoved){
        this.value -= ValueRemoved + 5.00;
        System.out.println("New value: " + this.value);
    }
}
