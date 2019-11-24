/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classpolimorfisme;

/**
 *
 * @author Agata
 */
public class PermanenEmployee extends Employee implements Payable {
    private int salary;

    public PermanenEmployee(String nama, int salary) {
        this.nama = nama;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "registered as permanent employee with salary"+salary+"\n";
        return info;
    }

    @Override
    public int getPatmentAmount() {
        return (int) (salary+0.05*salary);
    }
}
