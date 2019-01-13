package univercity;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String nameStud;
    private String surnameStud;
    private  int god;
    private int numZach;

    public Student(String nameStud, String surnameStud, int numZach) {
        this.nameStud = nameStud;
        this.surnameStud = surnameStud;
        this.numZach = numZach;
    }

    public Student(String namestud, String surnamestud) {
        this.nameStud = namestud;
        this.surnameStud = surnamestud;
        this.numZach=0;
    }

    public String getNameStud() {
        return nameStud;
    }

    public void setNameStud(String nameStud) {
        this.nameStud = nameStud;
    }

    public String getSurnameStud() {
        return surnameStud;
    }

    public void setSurnameStud(String surnameStud) {
        this.surnameStud = surnameStud;
    }

    public int getGod() {
       try {
           return god;
       }
       catch (NullPointerException e)
       {
           java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
           calendar.setTime(new java.util.Date());
           god = calendar.get(java.util.Calendar.YEAR);
       }
       return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getNumZach() {
        return numZach;
    }

    public void setNumZach(int numZach) {
        this.numZach = numZach;
    }
    ArrayList getStudent(){
        ArrayList student = new ArrayList();
        student.add(numZach);
        student.add(surnameStud);
        student.add(nameStud);
        student.add(god);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStud='" + nameStud + '\'' +
                ", surnameStud='" + surnameStud + '\'' +
                ", god=" + god +
                ", numZach=" + numZach +
                '}';
    }

}
