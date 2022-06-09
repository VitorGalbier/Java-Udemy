package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalVaule;

    private List<Installment> listInstallment = new ArrayList<>();

    public Contract(Integer number, Date date, Double totalVaule) {
        this.number = number;
        this.date = date;
        this.totalVaule = totalVaule;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalVaule() {
        return totalVaule;
    }

    public void setTotalVaule(Double totalVaule) {
        this.totalVaule = totalVaule;
    }

    public List<Installment> getListInstallment() {
        return listInstallment;
    }

    public void addList (Installment installment){
        listInstallment.add(installment);
    }

    public void removeList (Installment installment){
        listInstallment.remove(installment);
    }

}
