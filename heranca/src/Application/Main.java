package Application;

import Entities.Account;
import Entities.BussinessAccount;
import Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        Account acc = new Account(1001, "Alex", 0.0);

        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        acc1.getBalance();

        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

        //BussinessAccount acc5 = (BussinessAccount) acc3; // isso e errado!!!!!
        //testar a classe com instanceof

        if(acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update!!");
        }

        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        list.add(acc2);
        list.add(acc);
        list.add(acc1);
        list.add(acc3);

        double sum = 0;
        for(Account item : list){
            System.out.println(item.getBalance());
            sum += item.getBalance();
        }
        System.out.println(sum);
    }
}
