package univercity;

import java.util.LinkedList;

public class ContractStudent extends Student {

    private  final float priceSem=10000;
    private LinkedList<Payment> payStud;

    public ContractStudent(String nameStud, String surnameStud, int numZach) {
        super(nameStud, surnameStud, numZach);
        payStud=new LinkedList<Payment>();
    }

    public ContractStudent(String namestud, String surnamestud) {
        super(namestud, surnamestud);
    }

    public float getPriceSem() {
        return priceSem;
    }

    public LinkedList<Payment> getPayStud() {
        return payStud;
    }

    public void setPayStud(LinkedList<Payment> payStud) {
        this.payStud = payStud;
    }

    @Override
    public String toString() {
        return "ContractStudent{" +
                "priceSem=" + priceSem +
                ", payStud=" + payStud +
                '}';
    }
}
